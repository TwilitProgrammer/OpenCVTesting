/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencvtesting;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.core.CvType;
import org.opencv.core.MatOfByte;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.highgui.Highgui;
import org.opencv.highgui.VideoCapture;
import org.opencv.imgproc.Imgproc;
import java.util.Random;

/**
 *
 * @author Kyle
 */
public class OpenCVTesting
{
    static Mat frame, frame_gray;
    static Mat dst;
    static Mat mapX, mapY;
    static MatOfByte matOfByte;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
         /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CameraWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CameraWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CameraWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CameraWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        CameraWindow cWindow = new CameraWindow();
        cWindow.setVisible(true);
            
        
        Random gen = new Random();
        JFrame frameF = new JFrame();
        System.loadLibrary("opencv_java248");

        VideoCapture camera = new VideoCapture(0);
        camera.open(0); //Useless
        
        if(!camera.isOpened()) 
        {
            System.out.println("Camera Error");
        } 
        else 
        {
            System.out.println("Camera OK?");
        }

        frame = new Mat();
        frame_gray = new Mat();
        camera.read(frame);
        showResult(frame, frameF);

        dst = new Mat(frame.size(), frame.type());
        mapX = new Mat(frame.size(), CvType.CV_32FC1);
        mapY = new Mat(frame.size(), CvType.CV_32FC1);
        boolean bEnd = true;
        while(bEnd)
        {
            
        camera.read(frame);
        Imgproc.cvtColor(frame, frame_gray, Imgproc.COLOR_BGR2GRAY);
        Imgproc.GaussianBlur(frame_gray, frame_gray, new Size(1, 1), 2);
        Imgproc.equalizeHist(frame_gray, frame_gray);
        Mat circles = new Mat();
        
        Imgproc.HoughCircles(frame_gray, circles, Imgproc.CV_HOUGH_GRADIENT, cWindow.get_dp(), frame_gray.rows()/8, cWindow.get_param1(), cWindow.get_param2(), 0, 0);
        //System.out.println(circles.rows());
        
        for(int i = 0; i < circles.cols(); i++)
        {
            double[] circle = circles.get(0, i);
            Point center = new Point(Math.round(circle[0]), Math.round(circle[1]));
            int radius = (int)Math.round(circle[2]);
            Core.circle(frame, center, 3, new Scalar(gen.nextInt(), gen.nextInt(), gen.nextInt()), -1, 8, 0);
            Core.circle(frame, center, radius, new Scalar(gen.nextInt(), gen.nextInt(), gen.nextInt()), 3, 8, 0);
        }
        showResult(frame, frameF);
         
        }
        //Highgui.imwrite("camera1.jpg", frame);
        //System.out.println("OK");

    }
    
    public static void showResult(Mat img, JFrame frameF) throws IOException
    {
        matOfByte = new MatOfByte();
        Highgui.imencode(".jpg", img, matOfByte);
        byte[] byteArray = matOfByte.toArray();
        BufferedImage bufImage = null;
        ByteArrayInputStream in = new ByteArrayInputStream(byteArray);
        bufImage = ImageIO.read(in);
        //JFrame frameF = new JFrame();
        JLabel image = new JLabel(new ImageIcon(bufImage));
        
        if(frameF.getContentPane().getComponents().length == 0)
        {
            frameF.getContentPane().add(image);
        }
        else
        {
            frameF.getContentPane().remove(frameF.getContentPane().getComponents().length-1);
            frameF.getContentPane().add(image);
        }
        
        frameF.pack();
        frameF.setVisible(true);
    }
    
    

}
