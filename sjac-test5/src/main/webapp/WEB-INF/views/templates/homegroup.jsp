<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
	<div class="row">
		<div class="col-md-12">
			<div class="section-header">
				<h2>최근 생성 그룹</h2>
			</div>

		</div>
	</div>

	<!--최근 생성 그룹 생성----------- -->
	<!--최근 생성 그룹 생성----------- -->
	<!--최근 생성 그룹 생성----------- -->
	<!--최근 생성 그룹 생성----------- -->
	<div id="featured-products" class="owl-carousel owl-carousel-featured">

<c:forEach items="${requestScope.groupList }" begin="0" end="12" var="gvo">
	<!-- 그룹 설명 부 시작 -->
					<div class="item">
						<div class="item-ads-grid">

							<!-- 이미지 넣는 부분 시작 -->
							<div class="item-img-grid">
								<img alt="레오" src="assets/img/products/product-1.jpg" class="img-responsive img-center">
							</div>
							<!-- 이미지 넣는 부분 끝 -->

							<!-- 스터디 그룹명 부 시작 -->
							<div class="item-title">
								<a href="detail.html"><h4>${gvo.gName }</h4></a>
							</div>
							<!-- 스터디 그룹명 부 끝 -->


							<div class="item-meta">
								<ul>
									<li class="item-cat"><i class="fa fa-bars"></i> 분류</li>
									<li class="item-cat"><a href="category.html"> ${gvo.subjectVO.subject }</a></li>
								</ul>

								<ul>
									<li class="item-location"><a href="category.html"><i
											class="fa fa-map-marker"></i> 지역</a></li>
									<li class="item-location"><a href="category.html">${gvo.gLocation }</a></li>
								</ul>

								<ul>
									<li class="item-date"><i class="fa fa-recycle"></i> 인원</li>
									<li class="item-date">현재인원/${gvo.gCount }</li>
								</ul>


								<ul>
									<li class="item-type"><i class="fa fa-recycle"></i> 소개</li><br>
									<li class="item-type">${gvo.gInfo }</li>
								</ul>
							</div>


							<div class="product-footer">
								<div class="item-price-grid pull-left">
									<h3>${gvo.memberVO.name }</h3>
									<span>${gvo.memberVO.id }</span>
								</div>


								<!-- 우측 하단 버튼 부 시작 -->
								<div class="item-action-grid pull-right">
									<ul>
										<li><a href="#" data-toggle="tooltip" data-placement="top" title="Save Favorite" class="btn btn-default btn-sm"><i class="fa fa-heart"></i></a></li>
										<li><a href="그룹상세페이지url" data-toggle="tooltip"	data-placement="top" title="Show Details" class="btn btn-success btn-sm"><i class="fa fa-eye"></i></a></li>
									</ul>
								</div>
								<!-- 우측 하단 버튼 부 끝 -->

							</div>
						</div>
					</div>
					<!-- 그룹 설명 부 끝 -->

</c:forEach>
					<!-- 수정했음 -->
					<!--  15 개까지만 보여주기 -->

					




					<!--최근 생성 그룹 끝----------- -->
					<!--최근 생성 그룹 끝----------- -->
					<!--최근 생성 그룹 끝----------- -->
					<!--최근 생성 그룹 끝----------- -->
				</div>
				
		