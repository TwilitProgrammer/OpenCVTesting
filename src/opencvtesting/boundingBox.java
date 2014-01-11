/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package opencvtesting;

import java.awt.Image;
import org.opencv.core.Mat;
import org.opencv.highgui.VideoCapture;

/**
 *
 * @author Kyle
 */
public class boundingBox
{
    Mat src;
    Mat src_gray;
    int thresh = 100;
    int max_thresh = 255;
    VideoCapture img = new VideoCapture(0);
   // Image<Bgr, Byte> image = 
}
