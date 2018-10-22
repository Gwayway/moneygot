insert  into userinfo (username, password, openid) values (#{username},#{password})
select  username from  userinfo where username=#{username}
select  * from  userinfo where username=#{username}
DELETE  from  usermission where  missionid=#{missionid}
insert  into  message (messagecontext,messagepicture) values (#{messagecontext},#{messagepicture})
update  message set messagecontext=#{messagecontext},messagepicture=#{messagepicture}
insert  into  missionmessage (missionid,messageid) values (#{missionid},#{messageid})
delete  from  missionmessage where mission=#{missionid}
insert  into  mission (missioncontext,missionmoney,timeout) values (#{missioncontext},#{missionmoney},#{timeout})
delete  from  mission where missionid=#{missionid}
select  * from  mission where  missionid#{missionid}
update  mission set  missioncontext=#{missioncontext},missionmoney=#{missionmoney},timeout=#{timeout}
select  * from  message where messageid=#{messageid}
update  message set messagecontext#{messagecontext},messagepicture#{messagepicture}
insert  into  tag (tagname)VALUES (tagname#{tagname})
delete  from  tag where  tagid=#{tagid}
update  userinfo set username=#{username},password=#{password}
insert  into  usertag (userid,tagid) values (userid=#{userid},tagid=#{tagid})
delete  from  usertag where userid=#{userid}