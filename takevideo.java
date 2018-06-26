package record;

public class vid {
    System.loadLibrary(Core.NATIVE_LIBRARY_NAME);  
    VideoCapture camera = new VideoCapture(0);  
      
    VideoWriter writer = new VideoWriter("D:/workspace/JavaFXSwingApplication1/test.avi", VideoWriter.fourcc('X', 'V', 'I', 'D'), 15, new Size(1280, 720), true);  
      
    camera.set(Videoio.CV_CAP_PROP_FRAME_WIDTH, 1280);  
    camera.set(Videoio.CV_CAP_PROP_FRAME_HEIGHT, 720);  
     
    
    if(!camera.isOpened()){  
        System.out.println("Error");  
    }  
    else {  
        int index = 0;  
        Mat f = new Mat();  
        while(true){  
            if (camera.read(f)){  
                System.out.println("Captured Frame Width " + f.width() + " Height " + f.height());  
                writer.write(f);  
    
                try {  
                    Thread.currentThread().sleep(66);
                } catch (InterruptedException ex) {
                    Logger.getLogger(APP.class.getName()).log(Level.SEVERE, null, ex);
                }
                index++;  
            }  

            if (index > 200) {  
                break;  
            }  
              
            f.release();  
        }     
    }  
    writer.release();  
    camera.release();  
}
