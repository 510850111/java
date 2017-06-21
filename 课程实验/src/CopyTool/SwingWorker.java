package CopyTool;

public class SwingWorker {

	public static boolean isStop = false;
	
	private static final Runnable FileCopier = null;
	//来源文件
    private static String sourceFile;
    //目标文件
    private static String targetFile;
    //分块数
    private static int blockCount;
    
    
    public static void start(String sourceFile2, String targetFile2, int blockCount) {
        // TODO Auto-generated method stub
        //
        sourceFile=sourceFile2;
        targetFile=targetFile2;
        //记录开始时间
        long beginTime=System.currentTimeMillis();
        //依次分块进行文件COPY
        for(int i=0;i<blockCount;i++)
        {
        	if (isStop) {
				break;
			}
            //实例化文件复制对象
            @SuppressWarnings("unused")
			FileCopier copyFile=new FileCopier(sourceFile,targetFile,blockCount,i);
            //实例化线程
            Thread thread=new Thread(FileCopier);
            //开始线程
            thread.start();
            try
            {
                //加入线程
                thread.join();
            }
            catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            FrameMain.setJProgressBar1Value(blockCount);
        }
        //计算耗时
        long endTime=System.currentTimeMillis();
        //输出耗时
        System.out.println("共用时:"+(endTime-beginTime)+"ms");

    }

	
}
