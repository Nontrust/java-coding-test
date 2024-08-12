package programmers;

public class P72410 {
    public String solution(String new_id) {
        return new KAKAO_ID(new_id)
                .replaceToLowerCase()
                .replaceNameAgreeCharacter()
                .toSingleDot()
                .removeStartEndDot()
                .setBlankToACharater()
                .removeGraterThen16()
                .setLessThen2Charater()
                .getResult();
    }
}
class KAKAO_ID{
    String id;
    public KAKAO_ID(String id){
        this.id = id;
    }
    KAKAO_ID replaceToLowerCase(){
        this.id = id.toLowerCase();
        return this;
    }
    KAKAO_ID replaceNameAgreeCharacter(){
        this.id = id.replaceAll("[^a-zA-Z0-9._-]","");
        return this;
    }
    KAKAO_ID toSingleDot(){
        this.id = id.replaceAll("[.]{2,}",".");
        return this;
    }
    KAKAO_ID removeStartEndDot(){
        this.id = id.replaceAll("^[.]|[.]$", "");
        return this;
    }

    KAKAO_ID removeEndDot(){
        this.id = id.replaceAll("[.]$", "");
        return this;
    }
    KAKAO_ID setBlankToACharater(){
        if(this.id.isEmpty()){
            this.id = "a";
        }
        return this;
    }
    KAKAO_ID removeGraterThen16(){
        if(this.id.length()>=16){
            this.id = this.id.substring(0, 15);
        }
        return removeStartEndDot();
    }
    KAKAO_ID setLessThen2Charater(){
        while(this.id.length()<=2){
            this.id += this.id.charAt(this.id.length()-1);
        }
        return this;
    }
    String getResult(){
        return this.id;
    }
}