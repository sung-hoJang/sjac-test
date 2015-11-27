<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

           
            <section class="main no-padding">
                <div class="account-header">
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-4 col-md-3 col-lg-2">
                                <!-- User avatar -->
                                <div class="profile_avatar">
                                    <img src="assets/img/people/gie.jpg" alt="avatar" class="img-responsive">
                                </div>
                            </div>
                            <div class="col-sm-8 col-md-9 col-lg-10">
                                <div class="profile_summary">
                                    <!-- User name --> 
                                    <h3 class="profile_name">${sessionScope.mvo.name }</h3>
                                    <!-- User status -->
                                    <p>Hello.. I'am a frontend developer.</p>
                                    <!-- Contact -->
                                    <a href="logout.do" class="btn btn-primary btn-warning btn-sm"><i class="fa fa-sign-out"></i> 로그아웃 </a>
                                </div> <!-- / .profile__summary -->
                            </div>
                        </div> <!-- / .row -->
                    </div> <!-- / .container -->
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-md-3 col-sm-3">
                            <div class="widget">
                                <div class="widget-header">
                                    <h3>Author Menus</h3>
                                </div>
                                <div class="widget-body">
                                    <ul class="author-menus">

                                        <li><a href="account_posts.html">My Ads</a></li>
                                        <li><a href="account_create_post.html">Create New Ads</a></li>
                                        <li><a href="account_profile.html">My Profile</a></li>
                                        <li><a href="index.html">Signout</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-9 col-sm-9">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title">My Ads</h4>
                                </div>
                                <div class="panel-body">
                                    <div class="before-table">
                                        <div class="row">
                                            <div class="col-xs-6">
                                                <a href="account_create_post.html" class="btn btn-custom"><i class="fa fa-plus"></i> New Ads</a>
                                            </div>
                                            <div class="col-xs-6">
                                                <form class="form-inline pull-right">
                                                    <div class="form-group">
                                                            <div class="input-group">
                                                                <input type="text" name="q" placeholder="Type keyword ..." class="form-control">
                                                                <div class="input-group-addon"><i class="fa fa-search"></i></div>
                                                            </div>
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                    <table class="table table-bordered">
                                        <thead>
                                            <tr>
                                                <th><input id="checkAll" type="checkbox" /></th>
                                                <th>Photo
                                                <th>Details</th>
                                                <th>Price</th>
                                                <th>Status</th>
                                                <th style="width:10%">Option</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td><input type="checkbox"></td>
                                                <td><img alt="" class="thumb-img img-responsive" src="assets/img/products/product-6.jpg"></td>
                                                <td>
                                                    <div class="item-title"><a href="detail.html" target="_blank"><strong>Samsung Tab 3 V 116</strong></a></div>
                                                    <div class="item-meta">
                                                        <ul>
                                                            <li class="item-date"><i class="fa fa-clock-o"></i> Today 10.35 am</li>
                                                            <li class="item-location"><a href="category.html"><i class="fa fa-map-marker"></i> Manchester</a></li>
                                                            <li class="item-type"><i class="fa fa-bookmark"></i> Used</li>
                                                        </ul>
                                                    </div>
                                                </td>
                                                <td><strong>$50</strong></td>
                                                <td>Active</td>
                                                <td>
                                                    <ul class="actions-table">
                                                        <li><a class="label label-success"><i class="fa fa-pencil"></i> edit</a></li>
                                                        <li><a class="label label-warning"><i class="fa fa-close"></i> disable</a></li>
                                                        <li><a href="#" class="label label-danger" onclick="return confirm('Remove this item?')"><i class="fa fa-trash"></i> delete</a></li>
                                                    </ul>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td><input type="checkbox"></td>
                                                <td><img alt="" class="thumb-img img-responsive" src="assets/img/products/item-1.jpg"></td>
                                                <td>
                                                    <div class="item-title">
                                                        <a href="detail.html" target="_blank"><strong>Laptop Lenovo Thinkpad Core i3</strong></a>
                                                    </div>
                                                    <div class="item-meta">
                                                        <ul>
                                                            <li class="item-date"><i class="fa fa-clock-o"></i> Today 10.35 am</li>
                                                            <li class="item-location"><a href="category.html"><i class="fa fa-map-marker"></i> Manchester</a></li>
                                                            <li class="item-type"><i class="fa fa-bookmark"></i> New</li>
                                                        </ul>
                                                    </div>
                                                </td>
                                                <td><strong>$300</strong></td>
                                                <td>Active</td>
                                                <td>
                                                    <ul class="actions-table">
                                                        <li><a class="label label-success"><i class="fa fa-pencil"></i> edit</a></li>
                                                        <li><a class="label label-warning"><i class="fa fa-close"></i> disable</a></li>
                                                        <li><a href="#" class="label label-danger" onclick="return confirm('Remove this item?')"><i class="fa fa-trash"></i> delete</a></li>
                                                    </ul>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                    <div class="row">
                                        <div class="col-xs-3">
                                            <select class="form-control">
                                                <option selected="">Bulk Action</option>
                                                <option>Block</option>
                                                <option>Delete</option>
                                            </select>
                                        </div>
                                        <div class="col-xs-9 text-right">
                                            <ul class="pagination table-pagination">
                                                <li><a href="#">1</a></li>
                                                <li><a href="#">2</a></li>
                                                <li class="active"><a href="#">3</a></li>
                                                <li><a href="#">4</a></li>
                                                <li><a href="#">5</a></li>
                                            </ul>
                                        </div>
                                    </div>                  
                                </div>
                            </div>
                        </div>  
                    </div>
                </div>
            </section>
        <!-- Essentials -->
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/plugins/owl-carousel/owl.carousel.js"></script>
        <script src="assets/plugins/counter/jquery.countTo.js"></script>
        <script src="assets/plugins/filestyle/bootstrap-filestyle.min.js"></script>
        <script type="text/javascript">
            $("#checkAll").change(function () {
                $("input:checkbox").prop('checked', $(this).prop("checked"));
            });
        </script>