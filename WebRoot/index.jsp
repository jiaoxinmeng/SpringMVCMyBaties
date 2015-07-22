<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传文件</title>
</head>
<body>
	<form action="fileController/upload.do" method="post"
		enctype="multipart/form-data">
		选择文件:<input type="file" name="upload" /><br /> <input type="submit"
			value="上传" /> <input type="reset" value="重置" />
	</form>
</body>
</html>