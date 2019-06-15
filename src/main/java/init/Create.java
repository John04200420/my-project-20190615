package init;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.sql.rowset.serial.SerialException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import chat.model.ChatBean;
import clip.model.ClipBean;
import clip.model.ScriptBean;
import friend.model.FriendBean;
import friend.model.FriendRequestBean;
import member.model.FriendListBean;
import post.model.PostBean;
import post.model.RecordBean;
import register.model.MemberBean;

public class Create {

	public static void main(String[] args) throws FileNotFoundException, IOException, SerialException, SQLException {
		// TODO Auto-generated method stub
		Timestamp ts = new java.sql.Timestamp(System.currentTimeMillis());
		//member資料
		MemberBean mb0 =new MemberBean(null, "nullString", "12345","nullString", "nullString","nullString", ts, "/data/memberPicture/default.png",null, 0, false, false,null,null);
		MemberBean mb1 =new MemberBean(null, "whiloud02@gmail.com", "6f7e5a841f0792d8867e6b5a1cf37993","WhiWhi", "M","NULL", ts, "/data/memberPicture/2.jpg",null, 30, false, false,null,null);
		MemberBean mb2 =new MemberBean(null, "whiloud03@gmail.com", "6f7e5a841f0792d8867e6b5a1cf37993","Linda", "F","NULL", ts, "/data/memberPicture/3.jpg",null, 10, true, false,null,null);
		MemberBean mb3 =new MemberBean(null, "whiloud04@gmail.com", "6f7e5a841f0792d8867e6b5a1cf37993","Mark", "M","NULL", ts, "/data/memberPicture/4.jpg",null, 5, false, false,null,null);
		MemberBean mb4 =new MemberBean(null, "whiloud05@gmail.com", "6f7e5a841f0792d8867e6b5a1cf37993","Neow", "O","NULL", ts, "/data/memberPicture/5.jpg",null, 7, false, false,null,null);
		MemberBean mb5 =new MemberBean(null, "whiloud06@gmail.com", "6f7e5a841f0792d8867e6b5a1cf37993","Mary", "F","NULL", ts, "/data/memberPicture/6.jpg",null, 0, false, false,null,null);
		MemberBean mb6 =new MemberBean(null, "whiloud07@gmail.com", "6f7e5a841f0792d8867e6b5a1cf37993","John", "M","NULL", ts, "/data/memberPicture/7.jpg",null, 0, false, false,null,null);
		MemberBean mb7 =new MemberBean(null, "whiloud08@gmail.com", "6f7e5a841f0792d8867e6b5a1cf37993","AloHa", "O","NULL", ts, "/data/memberPicture/8.jpg",null, 0, false, false,null,null);
		MemberBean mb8 =new MemberBean(null, "whiloud09@gmail.com", "6f7e5a841f0792d8867e6b5a1cf37993","Shadow", "O","NULL", ts, "/data/memberPicture/9.jpg",null, 0, false, false,null,null);
		MemberBean mb9 =new MemberBean(null, "whiloud10@gmail.com", "6f7e5a841f0792d8867e6b5a1cf37993","Adela", "F","NULL", ts, "/data/memberPicture/10.jpg",null, 0, false, false,null,null);
		MemberBean mb10 =new MemberBean(null, "whiloud11@gmail.com", "6f7e5a841f0792d8867e6b5a1cf37993","SleepCat", "O","NULL", ts, "/data/memberPicture/11.jpg",null, 0, false, false,null,null);
		MemberBean mb11 =new MemberBean(null, "whiloud12@gmail.com", "6f7e5a841f0792d8867e6b5a1cf37993","Jack", "M","NULL", ts, "/data/memberPicture/12.jpg",null, 0, false, false,null,null);
		MemberBean mb12 =new MemberBean(null, "whiloud13@gmail.com", "6f7e5a841f0792d8867e6b5a1cf37993","Yuri", "F","NULL", ts, "/data/memberPicture/13.jpg",null, 0, false, false,null,null);
		MemberBean mb13 =new MemberBean(null, "whiloud14@gmail.com", "6f7e5a841f0792d8867e6b5a1cf37993","Hiro", "M","NULL", ts, "/data/memberPicture/14.jpg",null, 0, false, false,null,null);
		MemberBean mb14 =new MemberBean(null, "whiloud15@gmail.com", "6f7e5a841f0792d8867e6b5a1cf37993","Zoro", "O","NULL", ts, "/data/memberPicture/15.jpg",null, 0, false, false,null,null);
		MemberBean mb15 =new MemberBean(null, "whiloud16@gmail.com", "6f7e5a841f0792d8867e6b5a1cf37993","Luffy", "O","NULL", ts, "/data/memberPicture/16.jpg",null, 0, false, false,null,null);
		MemberBean mb16 =new MemberBean(null, "whiloud17@gmail.com", "6f7e5a841f0792d8867e6b5a1cf37993","Chopper", "O","NULL", ts, "/data/memberPicture/17.jpg",null, 0, false, false,null,null);
		MemberBean mb17 =new MemberBean(null, "whiloud18@gmail.com", "6f7e5a841f0792d8867e6b5a1cf37993","Nami", "O","NULL", ts, "/data/memberPicture/18.jpg",null, 0, false, false,null,null);
		MemberBean mb18 =new MemberBean(null, "whiloud19@gmail.com", "6f7e5a841f0792d8867e6b5a1cf37993","Brook", "O","NULL", ts, "/data/memberPicture/19.jpg",null, 0, false, false,null,null);
		
		Set<MemberBean> mb = new LinkedHashSet<>();
		mb.add(mb0);mb.add(mb1);mb.add(mb2);mb.add(mb3);mb.add(mb4);mb.add(mb5);
		mb.add(mb6);mb.add(mb7);mb.add(mb8);mb.add(mb9);mb.add(mb10);
		mb.add(mb11);mb.add(mb12);mb.add(mb13);mb.add(mb14);mb.add(mb15);
		mb.add(mb16);mb.add(mb17);mb.add(mb18);
		//clip資料
		ClipBean cb1 =new ClipBean(null,"/data/clip/1.mp4","FAST & FURIOUS: Hobbs & Shaw","/data/clip/a.jpg",ts,"HOBBS","male","SHAW","male","This is the first clip.",null);
		ClipBean cb2 =new ClipBean(null,"/data/clip/2.mp4","40不惑-1","/data/clip/b.jpg",ts,"Pete","male","Barry","male","如果老婆遇到什麼大事",null);
		ClipBean cb3 =new ClipBean(null,"/data/clip/3.mp4","40不惑-2","/data/clip/c.jpg",ts,"Debbie","female","Pete","male","為什麼不跟我吵架.",null);
		ClipBean cb4 =new ClipBean(null,"/data/clip/4.mp4","自殺突擊隊-醫師vs小丑","/data/clip/d.jpg",ts,"Narrator|Dr. Quinzel","female","Joker","male","女醫生愛上犯人",null);
		ClipBean cb5 =new ClipBean(null,"/data/clip/5.mp4","星際異攻隊-浣熊和Groot","/data/clip/e.jpg",ts,"Rocket Raccoon","male","Groot","both", "I'm Groot",null);
		Set<ClipBean> cb = new LinkedHashSet<>();
		cb.add(cb1);cb.add(cb2);cb.add(cb3);cb.add(cb4);cb.add(cb5);
		//post資料
		PostBean pb1 = new PostBean(null, "小弟急徵1配音", ts, "感謝大大幫忙，好友++", false, true, 0, false);
		PostBean pb2 = new PostBean(null, "獨立完成", ts, "一個人配音好無聊啊", false, true, 0, false);
		PostBean pb3 = new PostBean(null, "一起加好友", ts, "有沒有女高音願意幫忙~", false, false, 1, false);
		pb1.setMb1(mb1);pb1.setMb2(mb2);pb1.setCb(cb1);
		pb2.setMb1(mb1);pb2.setMb2(mb1);pb2.setCb(cb2);
		pb3.setMb1(mb3);pb3.setMb2(null);pb3.setCb(cb3);
		Set<PostBean> pb = new LinkedHashSet<>();
		pb.add(pb1);pb.add(pb2);pb.add(pb3);
		//script資料
		ScriptBean sb1 = new ScriptBean(null,1, "HOBBS", 6, 1, "1.40", "2.54", "pick a door", "選一道門");
		sb1.setCb(cb1);
		ScriptBean sb2 = new ScriptBean(null,2,"SHAW",6,2,"2.54","3.58","I\'ll right there","我選那道門");
		sb2.setCb(cb1);
		ScriptBean sb3 = new ScriptBean(null,1,"HOBBS",6,3,"3.58","5.20","No, that\'s my door. Pick another door","不，那是我的門，請選別的門");
		sb3.setCb(cb1);
		ScriptBean sb4 = new ScriptBean(null, 2,"SHAW",6,4,"5.20","6.24","What\'s wrong with you?","你有什麼問題嗎?");
		sb4.setCb(cb1);
		ScriptBean sb5 = new ScriptBean(null, 2,"SHAW",6,5,"8.52","9.98","You know what? You were right. This is your door?","你知道嗎?你是對的，這道是你的門");
		sb5.setCb(cb1);
		ScriptBean sb6 = new ScriptBean(null, 1,"HOBBS",6,6,"9.98","12.00","what\'s the matter. You got a lot of bad guys behind that door?","怎麼了? 你的門後面有很多壞蛋?");
		sb6.setCb(cb1);
		ScriptBean sb7 = new ScriptBean(null,1,"Pete",9,1,"0.50","3.19","This sounds horrible. But do you ever wondered what it would be like...","這聽起來很可怕，但你有沒有想過...");
		sb7.setCb(cb2);
		ScriptBean sb8 = new ScriptBean(null, 1,"Pete",9,2,"3.19","6.12","if you and your wife were separated by something bigger.","要是你跟你老婆因為某件嚴重的事而分開");
		sb8.setCb(cb2);
		ScriptBean sb9 = new ScriptBean(null, 1,"Pete",9,3,"6.63","8.55","like death, like her death.","像是死亡 譬如說她死了");
		sb9.setCb(cb2);
		ScriptBean sb10 = new ScriptBean(null, 2,"Barry",9,4,"8.55","10.7","I have given it a fair amount of thought.","我還真有認真想過");
		sb10.setCb(cb2);
		ScriptBean sb11 = new ScriptBean(null, 1,"Pete",9,5,"10.70","14.50","Not in a painful way, but just like a gentle floating off.","不是想像她痛苦的死了，只是像輕輕的飄走了那樣");
		sb11.setCb(cb2);
		ScriptBean sb12 = new ScriptBean(null, 2,"Barry",9,6,"14.50","17.61","It’s gotta be peaceful, I mean this is the mother of your children.","很安詳的那樣，她可是小孩的媽阿");
		sb12.setCb(cb2);
		ScriptBean sb13 = new ScriptBean(null, 1,"Pete",9,7,"17.61","19.23","And then the new wife would be great!","然後新的老婆很棒");
		sb13.setCb(cb2);
		ScriptBean sb14 = new ScriptBean(null, 2,"Barry",9,8,"19.23","21.53","God, I can’t wait to meet my second wife!","天啊！我等不及要跟我第二任老婆相遇了");
		sb14.setCb(cb2);
		ScriptBean sb15 = new ScriptBean(null, 2,"Barry",9,9,"21.55","24.63","I hope she likes me better than this one.","我希望她比我現任老婆還喜歡我");
		sb15.setCb(cb2);
		ScriptBean sb16 = new ScriptBean(null, 1,"Debbie",7,1,"0.83","1.97","Why didn’t you fight?","你為何不跟我吵?");
		sb16.setCb(cb3);
		ScriptBean sb17 = new ScriptBean(null, 2,"Pete",7,2,"1.91","4.00","I don’t know. You get so mad at me.","我不知道，你氣得要死");
		sb17.setCb(cb3);
		ScriptBean sb18 = new ScriptBean(null, 2,"Pete",7,3,"4.79","6.24","Sometimes I feel like you want to kill me.","有時候我覺得你想殺了我");
		sb18.setCb(cb3);
		ScriptBean sb19 = new ScriptBean(null, 1,"Debbie",7,4,"6.24","7.83","I do wanna kill you.","我是真的想殺了你");
		sb19.setCb(cb3);
		ScriptBean sb20 = new ScriptBean(null, 2,"Pete",7,5,"7.83","8.44","How would you do it?","你要怎麼殺?");
		sb20.setCb(cb3);
		ScriptBean sb21 = new ScriptBean(null, 1,"Debbie",7,6,"8.44","12.00","I would poison cupcakes that you pretend not to eat everyday","我會下毒在你每天假裝沒吃的杯子蛋糕裡");
		sb21.setCb(cb3);
		ScriptBean sb22 = new ScriptBean(null, 1,"Debbie",7,7,"12.00","16.25","I would enjoy our last few months together that while killing you","在殺你的同時我會好好的享受最後相處的幾個月");
		sb22.setCb(cb3);
		ScriptBean sb23 = new ScriptBean(null, 1,"Narrator",11,1,"0.14","3.21","She was assigned to The Clown himself.","她被派給了小丑");
		sb23.setCb(cb4);
		ScriptBean sb24 = new ScriptBean(null, 2,"Joker",11,2,"3.21","8.08","Dr. Quinzel, I lived for these moments with you.","奎澤爾醫生，我就盼著跟你共處的時光");
		sb24.setCb(cb4);
		ScriptBean sb25 = new ScriptBean(null, 2,"Joker",11,3,"8.87","10.41","What do you get?","你拿了什麼");
		sb25.setCb(cb4);
		ScriptBean sb26 = new ScriptBean(null, 1,"Dr. Quinzel",11,4,"10.41","12.25","I got you a kitty.","給你拿了隻小貓");
		sb26.setCb(cb4);
		ScriptBean sb27 = new ScriptBean(null, 2,"Joker",11,5,"12.25","13.84","So thoughtful","真體貼");
		sb27.setCb(cb4);
		ScriptBean sb28 = new ScriptBean(null, 1,"Narrator",11,6,"13.84","17.68","She thought she was curing him. But, she was falling in love","她以為自己在治療他，但其實她愛上了他");
		sb28.setCb(cb4);
		ScriptBean sb29 = new ScriptBean(null, 2,"Joker",11,7,"19.25","22.16","There is something you could do for me, doctor.","你可以幫我個忙，醫生");
		sb29.setCb(cb4);
		ScriptBean sb30 = new ScriptBean(null, 1,"Dr. Quinzel",11,8,"22.16","24.05","Anything. I mean, yeah.","你隨便說，當然");
		sb30.setCb(cb4);
		ScriptBean sb31 = new ScriptBean(null, 2,"Joker ",11,9,"24.05","26.08","I need a machine gun.","我需要一把機槍");
		sb31.setCb(cb4);
		ScriptBean sb32 = new ScriptBean(null, 1,"Dr. Quinzel",11,10,"28.36","30.02","A machine gun?","機槍?");
		sb32.setCb(cb4);
		ScriptBean sb33 = new ScriptBean(null, 1,"Narrator",11,11,"32.04","34.60","Talk about a workplace romance gone wrong.","這才叫辦公室戀情出了岔子");
		sb33.setCb(cb4);
		ScriptBean sb34= new ScriptBean(null,1,"Rocket Raccoon",10,1,"0","5.0","Then you push this button, which will give you five minutes to get out of there.","然後你再按這個按鈕，然後你有五分鐘的時間逃跑");
		sb34.setCb(cb5);
		ScriptBean sb35 = new ScriptBean(null, 1,"Rocket Raccoon",10,2,"5.0","9.76","Now, whatever you do. Don’t push this button","聽好，不管怎樣，千萬別按這個");
		sb35.setCb(cb5);
		ScriptBean sb36 = new ScriptBean(null,1,"Rocket Raccoon",10,3,"9.76","13.37","Because that would set off the bomb immediately and we’ll all be dead.","按下它炸彈會立刻爆炸，然後我們就死定了");
		sb36.setCb(cb5);
		ScriptBean sb37 = new ScriptBean(null, 1,"Rocket Raccoon",10,4,"13.37","15.71","Now, repeat back what I just said.","好了，重複一遍我剛說的話");
		sb37.setCb(cb5);
		ScriptBean sb38 = new ScriptBean(null, 2,"Groot",10,5,"15.71","19.41","I am Groot. I am Groot.","我叫格魯特x2");
		sb38.setCb(cb5);
		ScriptBean sb39 = new ScriptBean(null, 1,"Rocket Raccoon",10,6,"19.41","20.24","That’s right.","沒錯");
		sb39.setCb(cb5);
		ScriptBean sb40 = new ScriptBean(null, 2,"Groot",10,7,"20.24","21.09","I am Groot.","我叫格魯特");
		sb40.setCb(cb5);
		ScriptBean sb41 = new ScriptBean(null, 1,"Rocket Raccoon",10,8,"21.09","25.81","No! that’s the button that will kill everyone! Try again","不！這個按鈕會把我們都炸死的！再來一遍");
		sb41.setCb(cb5);
		ScriptBean sb42 = new ScriptBean(null, 2,"Groot",10,9,"28.11","33.68","I am Groot. I am Groot. I am Groot.","我叫格魯特x3");
		sb42.setCb(cb5);
		ScriptBean sb43 = new ScriptBean(null, 1,"Rocket Raccoon",10,10,"33.68","37.29","No! That’s exactly what you just said. How is that even possible?","不！這跟你剛說的一模一樣好嗎? 這怎麼可能呢?");
		sb43.setCb(cb5);
		Set<ScriptBean> sb = new LinkedHashSet<>();
		sb.add(sb1); sb.add(sb2); sb.add(sb3); sb.add(sb4); sb.add(sb5); sb.add(sb6); sb.add(sb7); sb.add(sb8); sb.add(sb9); sb.add(sb10);
		sb.add(sb11); sb.add(sb12); sb.add(sb13); sb.add(sb14); sb.add(sb15); sb.add(sb16); sb.add(sb17); sb.add(sb18); sb.add(sb19); sb.add(sb20);
		sb.add(sb21); sb.add(sb22); sb.add(sb23); sb.add(sb24); sb.add(sb25); sb.add(sb26); sb.add(sb27); sb.add(sb28); sb.add(sb29); sb.add(sb30);
		sb.add(sb31); sb.add(sb32); sb.add(sb33); sb.add(sb34); sb.add(sb35); sb.add(sb36); sb.add(sb37); sb.add(sb38); sb.add(sb39); sb.add(sb40);
		sb.add(sb41); sb.add(sb42); sb.add(sb43); 
		//chat表格
		ChatBean chb1 = new ChatBean(null, ts, "你好~", true);
		chb1.setMb1(mb1);chb1.setMb2(mb3);
		ChatBean chb2 = new ChatBean(null, ts, "Hello! Nice to meet u.", true);
		chb2.setMb1(mb3);chb2.setMb2(mb1);
		ChatBean chb3 = new ChatBean(null, ts, "哇！你英文好好喔，你學多久了啊", true);
		chb3.setMb1(mb1);chb3.setMb2(mb3);
		ChatBean chb4 = new ChatBean(null, ts, "Almost 3 years, but I\\'m still working on it.", true);
		chb4.setMb1(mb3);chb4.setMb2(mb1);
		ChatBean chb5 = new ChatBean(null, ts, "我都看不懂你寫的欸，可以教教我嗎?", true);
		chb5.setMb1(mb1);chb5.setMb2(mb3);
		ChatBean chb6 = new ChatBean(null, ts, "Use this app more and sure you will improve very fast", true);
		chb6.setMb1(mb3);chb6.setMb2(mb1);
		Set<ChatBean>chb  = new LinkedHashSet<>();
		chb.add(chb1);chb.add(chb2);chb.add(chb3);chb.add(chb4);chb.add(chb5);chb.add(chb6);
		//record 資料
		RecordBean rb1= new RecordBean(null, "/data/record/1.wav", ts);
		rb1.setPb(pb1);rb1.setMb(mb1);rb1.setSb(sb1);
		
		RecordBean rb2= new RecordBean(null, "/data/record/2.wav", ts);
		rb2.setPb(pb1);rb2.setMb(mb3);rb2.setSb(sb2);
		
		RecordBean rb3= new RecordBean(null, "/data/record/3.wav", ts);
		rb3.setPb(pb1);rb3.setMb(mb1);rb3.setSb(sb3);
		
		RecordBean rb4= new RecordBean(null, "/data/record/4.wav", ts);
		rb4.setPb(pb1);rb4.setMb(mb3);rb4.setSb(sb4);
		
		RecordBean rb5= new RecordBean(null, "/data/record/5.wav", ts);
		rb5.setPb(pb1);rb5.setMb(mb3);rb5.setSb(sb5);
		
		RecordBean rb6= new RecordBean(null, "/data/record/6.wav", ts);
		rb6.setPb(pb1);rb6.setMb(mb1);rb6.setSb(sb6);
		
		RecordBean rb7= new RecordBean(null, "/data/record/7.m4a", ts);
		rb7.setPb(pb2);rb7.setMb(mb1);rb7.setSb(sb7);
		
		RecordBean rb8= new RecordBean(null, "/data/record/8.m4a", ts);
		rb8.setPb(pb2);rb8.setMb(mb1);rb8.setSb(sb8);
		
		RecordBean rb9= new RecordBean(null, "/data/record/9.m4a", ts);
		rb9.setPb(pb2);rb9.setMb(mb1);rb9.setSb(sb9);
		
		RecordBean rb10= new RecordBean(null, "/data/record/10.m4a", ts);
		rb10.setPb(pb2);rb10.setMb(mb1);rb10.setSb(sb10);

		RecordBean rb11= new RecordBean(null, "/data/record/11.m4a", ts);
		rb11.setPb(pb2);rb11.setMb(mb1);rb11.setSb(sb11);
		
		RecordBean rb12= new RecordBean(null, "/data/record/12.m4a", ts);
		rb12.setPb(pb2);rb12.setMb(mb1);rb12.setSb(sb12);
		
		RecordBean rb13= new RecordBean(null, "/data/record/13.m4a", ts);
		rb13.setPb(pb2);rb13.setMb(mb1);rb13.setSb(sb13);
		
		RecordBean rb14= new RecordBean(null, "/data/record/14.m4a", ts);
		rb14.setPb(pb2);rb14.setMb(mb1);rb14.setSb(sb14);
		
		RecordBean rb15= new RecordBean(null, "/data/record/15.m4a", ts);
		rb15.setPb(pb2);rb15.setMb(mb1);rb15.setSb(sb15);
		
		RecordBean rb16= new RecordBean(null, null, ts);
		rb16.setPb(pb3);rb16.setMb(null);rb16.setSb(sb16);
		
		RecordBean rb17= new RecordBean(null, "/data/record/17.m4a", ts);
		rb17.setPb(pb3);rb17.setMb(mb3);rb17.setSb(sb17);
		
		RecordBean rb18= new RecordBean(null, "/data/record/18.m4a", ts);
		rb18.setPb(pb3);rb18.setMb(mb3);rb18.setSb(sb18);
		
		RecordBean rb19= new RecordBean(null, null, ts);
		rb19.setPb(pb3);rb19.setMb(null);rb19.setSb(sb19);
		
		RecordBean rb20= new RecordBean(null, "/data/record/20.m4a", ts);
		rb20.setPb(pb3);rb20.setMb(mb3);rb20.setSb(sb20);
		
		RecordBean rb21= new RecordBean(null,null, ts);
		rb21.setPb(pb3);rb21.setMb(null);rb21.setSb(sb21);
		
		RecordBean rb22= new RecordBean(null, null, ts);
		rb22.setPb(pb3);rb22.setMb(null);rb22.setSb(sb22);
		Set<RecordBean> rb  =new LinkedHashSet<>();
		rb.add(rb1);rb.add(rb2);rb.add(rb3);rb.add(rb4);rb.add(rb5);rb.add(rb6);rb.add(rb7);rb.add(rb8);rb.add(rb9);rb.add(rb10);
		rb.add(rb11);rb.add(rb12);rb.add(rb13);rb.add(rb14);rb.add(rb15);rb.add(rb16);rb.add(rb17);rb.add(rb18);rb.add(rb19);rb.add(rb20);
		rb.add(rb21);rb.add(rb22);
		
		//friend表格(memberNo2跟3~6互相是朋友)
		FriendBean fb1 = new FriendBean(null,mb1,mb2,ts,0);
		FriendBean fb2 = new FriendBean(null,mb2,mb1,ts,0);
		FriendBean fb3 = new FriendBean(null,mb1,mb3,ts,0);
		FriendBean fb4 = new FriendBean(null,mb3,mb1,ts,0);
		FriendBean fb5 = new FriendBean(null,mb1,mb4,ts,0);
		FriendBean fb6 = new FriendBean(null,mb4,mb1,ts,0);
		FriendBean fb7 = new FriendBean(null,mb1,mb5,ts,0);
		FriendBean fb8 = new FriendBean(null,mb5,mb1,ts,0);
		Set<FriendBean> fb  = new LinkedHashSet<>(
				Arrays.asList(fb1,fb2,fb3,fb4,fb5,fb6,fb7,fb8));

		//friendRequest表格(memberNo2發送邀請給7~9, memberNo2收到10的邀請)
		FriendRequestBean frb1 = new FriendRequestBean(null,mb1,mb6,ts);
		FriendRequestBean frb2 = new FriendRequestBean(null,mb1,mb7,ts);
		FriendRequestBean frb3 = new FriendRequestBean(null,mb1,mb8,ts);
		FriendRequestBean frb4 = new FriendRequestBean(null,mb9,mb1,ts);
		Set<FriendRequestBean> frb  = new LinkedHashSet<>(
				Arrays.asList(frb1,frb2,frb3,frb4));
		String path = 
				"src/main/webapp/WEB-INF/applicationContext.xml";
		ApplicationContext ctx = new FileSystemXmlApplicationContext(path);
		SessionFactory factory = (SessionFactory) ctx.getBean("sessionFactory");
		Session session = factory.openSession();
		Transaction tx= null;
		try {
			tx = session.beginTransaction();
			for(MemberBean memberBean :mb) {
				session.save(memberBean);
				}
			for(ClipBean clipBean :cb) {
				session.save(clipBean);
			}
			for(PostBean postDetailBean :pb) {
				session.save(postDetailBean);
			}
			for(ScriptBean scroptBean :sb) {
				session.save(scroptBean);
			}
			for(ChatBean chatBean:chb) {
				session.save(chatBean);
			}
			for(RecordBean recordBean:rb) {
				session.save(recordBean);
			}
			for(FriendBean firendBean:fb) {
				session.save(firendBean);
			}
			for(FriendRequestBean firendRequestBean:frb) {
				session.save(firendRequestBean);
			}
			tx.commit();
		}catch(Exception e) {
			if(tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
	}
}
