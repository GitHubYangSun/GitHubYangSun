package com.thinkingFruit.admin.controller;

/**
 * 
 * @author oldHuang
 * 
 * @Package com.ysdevelop.loarchard.merchant.controller
 * 
 * @Description 图片
 * 
 * @Version
 * 
 */
import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ysdevelop.common.exception.WebServiceException;
import com.ysdevelop.common.result.CodeMsg;
import com.ysdevelop.common.result.Result;
import com.ysdevelop.common.utils.Constant;
import com.ysdevelop.common.utils.QiniuUtil;



@RestController
@RequestMapping(value = "/qiniu")
public class ImageController {
	
	/**
	 * 上传图片到七牛云
	 */
	@RequestMapping(value = "/uploadImage", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	public Result<String> uploadImage(@RequestParam("imageFile") MultipartFile files, HttpServletRequest request) {

		String imagePath = null;
		// 文件保存路径
		String filePath = request.getSession().getServletContext().getRealPath("/uploadImage") + File.separator
				+ QiniuUtil.renamePic(files.getOriginalFilename());
		// 转存文件
		try {
			// 保存至服务器
			File file = new File((filePath));
			if (!file.exists()) {
				if(!file.getParentFile().exists()){
					file.getParentFile().mkdirs();
				}
				file.createNewFile();
			}
			files.transferTo(file);
			// 上传七牛云服务器
			imagePath = QiniuUtil.qiniuUpload(filePath);
			if (imagePath.contains(Constant.ERROR)) {
				throw new WebServiceException(CodeMsg.UPLOAD_FAILED);
			}
			// 路径为文件且不为空则进行删除
			if (file.isFile() && file.exists()) {
				file.delete();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Result.successData(imagePath);

	}
	
	/**
	 * 上传音频到七牛云
	 */
	@RequestMapping(value = "/uploadAudio", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	public Result<String> uploadAudio(@RequestParam("audioFile") MultipartFile files, HttpServletRequest request) {
		
		String imagePath = null;
		// 文件保存路径
		String filePath = request.getSession().getServletContext().getRealPath("/uploadAudio") + File.separator
				+ QiniuUtil.renamePic(files.getOriginalFilename());
		// 转存文件
		try {
			// 保存至服务器
			File file = new File((filePath));
			if (!file.exists()) {
				if(!file.getParentFile().exists()){
					file.getParentFile().mkdirs();
				}
				file.createNewFile();
			}
			files.transferTo(file);
			// 上传七牛云服务器
			imagePath = QiniuUtil.qiniuUpload(filePath);
			if (imagePath.contains(Constant.ERROR)) {
				throw new WebServiceException(CodeMsg.UPLOAD_FAILED);
			}
			// 路径为文件且不为空则进行删除
			if (file.isFile() && file.exists()) {
				file.delete();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Result.successData(imagePath);
		
	}

}
