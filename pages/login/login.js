// pages/login/login.js
Page({
  data:{
    username:"",
    password:""
  },
  usernameInput: function(e){
    this.setData({
      username:e.detail.value
    })
  },
  passwordInput: function(e){
    this.setData({
      password:e.detail.value
    })
  },
  login:function(){
    if(this.data.username==0||this.data.password==0){
      wx.showToast({
        title: '用户名和密码不能为空',
        icon: 'loading',
        duration: 2000
      })  

    }else{
      var that=this
      wx.request({
        url: '',
        data:{
          username:that.username,
          password:that.password
        },
        success:re=>{
          switch('1'){
            case '1':{
              wx.showToast({
                title: '登录成功',
                icon: 'success',
                duration: 2000
              }), 
              wx.navigateTo({
                url: ''+'?'+'username='+that.username,//添加
                success:re=>{
                }
              })
            }
          }
        }
      })

    }
  }
})