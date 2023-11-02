<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>여담: 비밀번호 재설정</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

	<!-- <script>
			alert("메일을 통해 비밀번호를 재설정해 주세요.");
			location.href="/app/main"
		</script> -->
	<style>
		.alert {
			width:800px;
			height:75px;
			display : flex;
			flex-direction: column;
			align-items:center;
			position : absolute;
			top:50%;
			left:50%;
			transform: translate(-50%, -50%) ;
		}	
	</style>
</head>
<body>
	<div class="text-center alert container alert-primary alert-dismissible fade show align-self-center" role="alert">
	  <strong style="font-size: x-large">메일을 통해 비밀번호를 재설정해 주세요.</strong>
	  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close" onClick="location.href='/app/main'"></button>
	</div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>