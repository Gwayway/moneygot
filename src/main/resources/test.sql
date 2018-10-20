insert  into userinfo (username, password, openid) values (#{username},#{password})
select  username from  userinfo where username=#{username}
select  * from  userinfo where username=#{username}