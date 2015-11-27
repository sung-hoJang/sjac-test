<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 로그인 폼 시작 부 -->
<div class="widget">
	<div class="widget-header">
		<h3>LOGIN</h3>
	</div>
	<div class="widget-body">
		<form action="login.do" method="post">
			<div class="form-group">
				<input type="text" class="form-control input-lg" placeholder="Id"
					name="id">
			</div>
			<div class="form-group">
				<input type="password" class="form-control input-lg"
					placeholder="Password" name="password">
			</div>
			<div class="form-group">
				<div class="checkbox">
					<label class="string optional" for="terms"> <input
						type="checkbox" id="terms" style=""> <a href="#">아이디
							기억</a>
					</label>
				</div>
			</div>
			<div class="form-group">
				<button class="btn btn-block btn-custom">로그인</button>
			</div>
		</form>
	</div>
</div>

<!-- 로그인 폼 끝 부 -->