// GripPipelineC.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

#include <opencv2/opencv.hpp>
#include <opencv2/core/core.hpp>
#include <opencv2/core/mat.hpp>
#include <opencv2/features2d/features2d.hpp>
#include <opencv2/imgproc/imgproc.hpp>
#include <opencv2/objdetect/objdetect.hpp>
#include <iostream>

using namespace cv;
using namespace std;

void process(Mat source0)
{

}

Mat resizeImageOutput(){
	
}

Mat rgbThresholdOutput(){

}

vector<KeyPoint> hslThresholdOutput(){

}

vector<vector<Point>> findContoursOutput(){

}

Mat findBlobsOutput(){

}


vector<Mat> filterContoursOutput(){

}

void resizeImage(Mat input, double width, double height, int interpolation, Mat output){
	resize(input, output, Size(width, height), 0.0, 0.0, interpolation);
}


void rgbThreshold(Mat input, vector<double>red, vector<double> green, vector<double> blue, Mat out){
	cvtColor(input, out, COLOR_BGR2RGB);
	inRange(out, Scalar(red[0], green[0], blue[0]), Scalar(red[1], green[1], blue[1]), out);
}

void hslThreshold(Mat input, vector<double> hue, vector<double> sat, vector<double> lum, Mat out){
	cvtColor(input, out, COLOR_BGR2HLS);
	inRange(out, Scalar(hue[0], lum[0], sat[0]), Scalar(hue[1], lum[1], sat[1]), out);
}

void findContours(Mat input, bool externalOnly, vector<vector<Point>> contours){
	Mat hiearchy;
	contours = Mat();
	int mode;
	if (externalOnly){
		mode = RETR_EXTERNAL;
	}
	else{
		mode = RETR_LIST;
	}
	int method = CHAIN_APPROX_SIMPLE;
	findContours(input, contours, hiearchy, mode, method);
}

void findBlobs(Mat input, double minArea, vector<double> circularity, bool darkBlobs, vector<KeyPoint> blobList){
	SimpleBlobDetector detector;

	//Put it into a config file


	detector.detect(input, blobList);

}

void filterContours(vector<vector<Point>> inputContours, double minArea, 
	double minPerimeter, double minWidth, double maxWidth, double minHeight, double maxHeight, vector<double> solidarity, double maxVertexCount, 
	double minVertexCount, double minRatio, double maxRatio, Mat output){
	vector<vector<Point>> hull(inputContours.size());
	output = Mat();

	for (int i = 0; i < inputContours.size(); i++){
		vector<Point> contour = inputContours[i];
		Rect bb = boundingRect(contour);
		if (bb.width < minWidth || bb.width > maxWidth) continue;
		if (bb.height < minHeight || bb.height > maxHeight) continue;
		double area = contourArea(contour);
		if (area < minArea) continue;
		

	}



	}

int main(){

	

}