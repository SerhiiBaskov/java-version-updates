package com.cydeo.MailTask;

import java.util.ArrayList;
import java.util.List;

public class MailTest {
    public static void main(String[] args) {

        List<Member> list = new ArrayList<>();

        list.add(new Member("John", 25, "male"));
        list.add(new Member("Anna", 15, "female"));
        list.add(new Member("Julia", 18, "female"));
        list.add(new Member("Nick", 16, "male"));
        list.add(new Member("Josh", 19, "male"));
        list.add(new Member("Mery", 29, "female"));

        list.forEach(member -> System.out.println(member));

        System.out.println("-------------------------------------");

        MemberPredicate filter18 = member -> member.getAge()>=18 && member.getAge()<=25
                && member.getSex().equals("male");
        System.out.println(filterMembers(list, filter18));

        System.out.println(filterMembers(list, member -> member.getAge()>=18 && member.getAge()<=25
                && member.getSex().equals("male")));

    }
    public static List<Member> filterMembers (List<Member> list, MemberPredicate filter){
        List<Member> result = new ArrayList<>();
        for (Member member : list) {
            if(filter.test(member)){
                result.add(member);
            }
        }
        return result;
    };

}
