public enum State{

ALABAMA("AL"),
ALASKA("AK"),
ARIZONA("AZ"),
ARKANSA("AR"),
CALIFORNiA("CA"),
COLORADO("CO"),
CONNETICUT("CT");


private String abbr;

 State(String abbr){
    this.abbr = abbr;

}

public String getAbbr(){

        return abbr;
}








}