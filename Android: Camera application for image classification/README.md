# Machine Learning Example
## Android: Camera application for image classification
A sample android application by which user can classify among set of images.  
We are retraining final layer of images to create labels and graphs for our provided set of images, classification model is getting created by Transfer Learning.  

We are using TensorFlow library of python here. TensorFlow is an open-source software library for dataflow programming across a range of tasks. It is a symbolic library used for machine learning applications such as neural networks.  
<br>
##### Following are the tasks we will be performing in this exercise:
* Retrain a MobileNet
* Convert the model to TFLite Format and create optimized graphs
* Setup Android App
* Test Run our customized app 
  
##### Prerequisites are as follow:  
* Install Tensorflow `$ pip install --upgrade "tensorflow==1.7.*"`  
* Android Studio setup [v3.1+]
* Android Device(With Debugging Enabled) or Emulator (API Level = 27, Target = Android 8.1)
