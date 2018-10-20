insert  into userinfo (username, password, openid) values (#{username},#{password})
select  username from  userinfo where username=#{username}
select  * from  userinfo where username=#{username}
DELETE  from  usermission where  missionid=#{missionid}
insert  into  message (messagecontext,messagepicture) values (#{messagecontext},#{messagepicture})
update  message set messagecontext=#{messagecontext},messagepicture=#{messagepicture}