<html>
<body>
<h2>Hello World!</h2>


	<form action="upload" method="post" enctype="multipart/form-data">
	  <label for="pdfFile">Choose a PDF file to upload:</label><br>
	  <!-- The 'accept' attribute helps the user select the correct file types -->
	  <input type="file" id="pdfFile" name="pdfFile" accept="application/pdf"><br><br>
	  <input type="submit" value="Upload PDF">
	</form>
	
	
</body>
</html>
