/** 网站后台管理 */
$(function() {
    // 初始化事件
    admin.initEvent();
    // 设置页面高度
    // common.initBodyHeight();
    // //设置内容区高度
    // $("#admin_main_content").height(document.documentElement.clientHeight -
    // $("div.topmenu").height() - $("div.banner_logo").height()-10);
});
// 服务商
var admin = {
    // 初始事件
    initEvent : function() {
        /**
         * 菜单点击事件
         */
        $(".sysmenu .menu_div").unbind("click").on("click", function() {
            // 先移除背景色，在当前菜单添加背景色
            $(".menu_div").removeClass("active");
            $(this).addClass("active");
            var val = $(this).data("type");
            // 账号
            if (val == "adm_account") {
                url = "/login/accIndex.do";
            }
            // 认证
            if (val == "adm_verify") {
                url = "/verify/vIndex.do";
            }
            // 客户管理
            if (val == "adm_cust") {
                url = "/user/uIndex.do?t=c";
            }
            // 服务商管理
            if (val == "adm_supplier") {
                url = "/user/uIndex.do?t=s";
            }
            // 页面
            if (val == "adm_page") {
                url = "/pages/pageIndex.do";
            }
            // 页面访问量
            if (val == "adm_pagevisit") {
                url = "/pvisit/pvIndex.do";
            }
            // 产品分类
            if (val == "adm_category") {
                url = "/category/capIndex.do";
            }
            // 客户分类
            if (val == "adm_cate_cust") {
                url = "/category/cacIndex.do";
            }
            // 广告
            if (val == "adm_advert") {
                url = "/advert/advIndex.do";
            }
            // 广告位
            if (val == "adm_advposition") {
                url = "/advpostion/advpIndex.do";
            }
            // 合作单位
            if (val == "joincompany") {
                url = "/joincom/jcIndex.do";
            }
            // 公告
            if (val == "adm_notice") {
                url = "/notice/nIndex.do";
            }
            // 资讯
            if (val == "adm_infomation") {
                url = "/infor/infIndex.do";
            }
            $("#admin_main_content").attr("src", topbanner.rootPath + url);
        });
    }

}