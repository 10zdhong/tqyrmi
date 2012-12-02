
package rmi;

import java.rmi.*;
import java.util.*;

//声明了文件传输的接口
public interface IFileTransport extends Remote
{
	//默认端口
	int defaultPort = 2046;
	
	//获取共享文件列表
	Vector<String> getFileList() throws Exception;	
	
	//获取文件长度
	int getFileLength(String fileName) throws Exception;	
	
	//获取文件内容
	//fileName: 文件名
	//start：起始位置
	//lenghg：字节长度
	byte[] getFile(String fileName, int start, int length) throws Exception;	
}

