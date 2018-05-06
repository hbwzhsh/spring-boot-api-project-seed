/** 用户管理 */
$(function() {
    // 初始化事件
    user.initEvent();
});

layui.use(['laydate','laypage'], function(){
    var totalNum = $("#totalNum").val();
    var currentPage = $("#currentPage").val();
    var pageNumber = $("#pageNumber").val();
    var laydate = layui.laydate;
    var laypage = layui.laypage;
    //执行一个laypage实例
    laypage.render({
        elem: 'paginate'
        ,count: totalNum
        ,curr: currentPage || 1
        ,jump: function(obj, first){
            if(!first){ //点击跳页触发函数自身，并传递当前页：obj.curr
                //获取点击的页码
                var currentPage = obj.curr;
                var actionUrl = "/admin_list?currentPage=" + currentPage;
                window.location.href = actionUrl;
            }
        }
    });
    //执行一个laydate实例
    laydate.render({
        elem: '#start' //指定元素
    });

    //执行一个laydate实例
    laydate.render({
        elem: '#end' //指定元素
    });
});

/*用户-停用*/
function member_stop(obj){
    var isUser = $(obj).parents("tr").find(".td-status").html();
    if(isUser =='否'){
        layer.confirm('确认要锁定吗？',function(){
            $(obj).find('i').html('&#xe62f;');
            //发异步把用户状态进行更改
            $(obj).parents("tr").find(".td-status").html('是');
            layer.msg('已锁定!',{icon: 5,time:1000});
        });
    } else {
        layer.confirm('确认要解锁吗？',function(){
            $(obj).find('i').html('&#xe601;');
            $(obj).parents("tr").find(".td-status").html('否');
            layer.msg('已解锁!',{icon: 1,time:1000});
        });
    }
}

/*用户-删除*/
function member_del(obj){
    var isUser = $(obj).parents("tr").find(".td-status").html();
    layer.confirm('确认要删除吗？',function(){
        //发异步把用户状态进行更改
        layer.msg('已删除!',{icon: 1,time:1000});
    });
}

var user = {
    // 初始事件
    initEvent : function() {
        $(".userView").unbind("click").on("click", function() {
            var id = $(this).parents("tr").find(".userId").val();
            x_admin_show('查看','/user/detail?id='+ id);
        });
    }

}