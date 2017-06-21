package CopyTool;

public class SwingWorker {

	public static boolean isStop = false;
	
	private static final Runnable FileCopier = null;
	//��Դ�ļ�
    private static String sourceFile;
    //Ŀ���ļ�
    private static String targetFile;
    //�ֿ���
    private static int blockCount;
    
    
    public static void start(String sourceFile2, String targetFile2, int blockCount) {
        // TODO Auto-generated method stub
        //
        sourceFile=sourceFile2;
        targetFile=targetFile2;
        //��¼��ʼʱ��
        long beginTime=System.currentTimeMillis();
        //���ηֿ�����ļ�COPY
        for(int i=0;i<blockCount;i++)
        {
        	if (isStop) {
				break;
			}
            //ʵ�����ļ����ƶ���
            @SuppressWarnings("unused")
			FileCopier copyFile=new FileCopier(sourceFile,targetFile,blockCount,i);
            //ʵ�����߳�
            Thread thread=new Thread(FileCopier);
            //��ʼ�߳�
            thread.start();
            try
            {
                //�����߳�
                thread.join();
            }
            catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            FrameMain.setJProgressBar1Value(blockCount);
        }
        //�����ʱ
        long endTime=System.currentTimeMillis();
        //�����ʱ
        System.out.println("����ʱ:"+(endTime-beginTime)+"ms");

    }

	
}
