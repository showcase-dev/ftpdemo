package com.dev;

import com.dev.util.FtpUtil;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

/**
 * Unit test for simple App.
 */
public class FtpFileDemoTest {

    private String ftpHost = "39.96.180.54";
    private String ftpUserName = "yishi_user";
    private String ftpPassword = "yishi123abc";
    private int ftpPort = 21;

    /**
     * 上传
     */
    @Test
    public void fileUpLoadTest() throws Exception{

        String filePath = "F:/data/ftp_info.txt";
        FileInputStream in=new FileInputStream(new File(filePath));
        boolean result = FtpUtil.uploadFile(ftpHost, ftpUserName, ftpPassword, ftpPort, "order", "ftp_info.txt",in);
        System.out.println(result);





    }

    /**
     * 下载
     */
    @Test
    public void fileDownLoadTest() {
        String fileName="ftp_info.txt";
        String ftpPath="order";
        String localPath="d:/";
        FtpUtil.downloadFtpFile(ftpHost,ftpUserName,ftpPassword,ftpPort,ftpPath,localPath,fileName);

    }
}
