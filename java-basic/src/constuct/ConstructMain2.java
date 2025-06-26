package constuct;

public class ConstructMain2 {

    public static void main(String[] args) {
        MemberConstuct member1 = new MemberConstuct("user1",15,90);
        MemberConstuct member2 = new MemberConstuct("user2",16);

        MemberConstuct[] members = {member1, member2};

        for(MemberConstuct s: members){
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
