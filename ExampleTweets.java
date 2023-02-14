

class User{
    String username;
    String displayName;
    int followers;

User(String username,String displayName,int followers   ){
    this.username=username;
    this.displayName=displayName;
    this.followers=followers;
}
String toText(){
    return displayName + " @" + username;
}
}
class Tweet{
    String textContent;
    User author;
    int likes;
    String uniqueID;

Tweet(String textContent,User author,int likes,String uniqueID){
    this.textContent=textContent;
    this.author=author;
    this.likes=likes;
    this.uniqueID=uniqueID;

}
boolean longerThan(Tweet other){
    if(this.textContent.length()>other.textContent.length()){
    return true;
    }
    else return false;
}
boolean moreLike(Tweet other){
    if(this.likes>other.likes){
        return true;
    }
    else return false;
}
String toText(){
    return author.displayName + " @"+author.username+" : "+this.textContent+" : "+ this.likes+" Likes";
}
String toLink(){
    return "https://twitter.com/"+ author.username + "/status/" + uniqueID;
}
}
class ExampleTweets{
    User ACM  = new User("acmucsd", "ACM @ UCSD",54);
    //link1:https://twitter.com/acmucsd/status/1465121704603271168?cxt=HHwWgIC-ubCblNUoAAAA
    //There were not any parts of the Tweet I couldn't represent with the class design we chose.
    Tweet acTweet1 = new Tweet("Meet us at the Gilman Dr & Myers Dr bus stop at 5pm! We'll be shuttling over at 5:15 and 5:30 to join us for ACM Bit-Byte ice skating! Map included in second image :) https://instagram.com/p/CW1yEpCpNNh/?utm_medium=twitter",
    ACM,2, "1465121704603271168");
    //https://twitter.com/acmucsd/status/1389471842063245314?cxt=HHwWhICzuerRssgmAAAA
    //There were not any parts of the Tweet I couldn't represent with the class design we chose.
    Tweet acTweet2 = new Tweet("How's everyone doing?",ACM,5,"1389471842063245314");
    String Text1 = ACM.toText();
    Boolean longer = acTweet1.longerThan(acTweet2);
    Boolean morelike1 = acTweet1.moreLike(acTweet2);
    String actweet1content = acTweet1.toText();
    String actweet1link = acTweet1.toLink();
    String actweet2content = acTweet2.toText();
    String actweet2link = acTweet2.toLink();
    
    User cassidy = new User("cassidoo", "Cassidy", 185000);
    //https://twitter.com/cassidoo/status/1617653552046043140?cxt=HHwWiMDTtbfVh_MsAAAA
    //There were not any parts of the Tweet I couldn't represent with the class design we chose.
    Tweet casTweet =  new Tweet("I'd quote tweet this and say  please subscribe hahahahahahahaha (👀) hahahahaha",cassidy,39,"1617653552046043140");
    String Text2 = cassidy.toText();
    //https://twitter.com/kprather88/status/1617682010767765504?cxt=HHwWgMDRtfnNlPMsAAAA
    //There were not any parts of the Tweet I couldn't represent with the class design we chose.
    User kim = new User("kprather88", "Kimberly Prather, Ph.D.", 85000);
    Tweet kimTweet = new Tweet("Perfect....this is exactly how you would keep this pandemic going.  @mehdirhasan we need you.", kim, 55, "1617682010767765504");
    Boolean longer2 = casTweet.longerThan(kimTweet);
    Boolean morelike2 = casTweet.moreLike(kimTweet);
}