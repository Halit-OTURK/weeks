package week4_stringClass;

public class EmailDomain_indexOf_substring {
    public static void main(String[] args) {

        String email= "asdfg@gmail.com";
        int beginningIndex=email.indexOf("@")+1;
        int endingIndex=email.indexOf(".");
        int endingIndex2= email.lastIndexOf(".");


        String domain= email.substring(beginningIndex,endingIndex);
        String domainA= email.substring(beginningIndex,endingIndex2);
        System.out.println(domain);
        System.out.println(domainA);

        String domain2=email.substring(endingIndex);
        String domain3=email.substring(endingIndex)+1;// funny important
        System.out.println(domain2);
        System.out.println(domain3);

    }
}
