package moreProblemsOnHashing;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArrayWithSumZero {

  public static void main(String[] args) {
    ArrayList<Integer> a= new ArrayList<>();
    a.add( 87);
    a.add( 745);
    a.add( -775);
    a.add( 784);
    a.add( -237);
    a.add( -70);
    a.add( 159);
    a.add( 937);
    a.add( 220);
    a.add( -971);
    a.add( -636);
    a.add( -882);
    a.add( 794);
    a.add( -605);
    a.add( -352);
    a.add( 248);
    a.add( -3);
    a.add( -595);
    a.add( 566);
    a.add( 921);
    a.add( 658);
    a.add( -378);
    a.add( 225);
    a.add( 477);
    a.add( -420);
    a.add( 567);
    a.add( -81);
    a.add( 93);
    a.add( -220);
    a.add( 919);
    a.add( 509);
    a.add( -229);
    a.add( -247);
    a.add( -91);
    a.add( 563);
    a.add( -20);
    a.add( 545);
    a.add( -56);
    a.add( 183);
    a.add( 858);
    a.add( -578);
    a.add( 100);
    a.add( -835);
    a.add( -595);
    a.add( 845);
    a.add( 13);
    a.add( -296);
    a.add( -110);
    a.add( -853);
    a.add( 924);
    a.add( 183);
    a.add( 799);
    a.add( 828);
    a.add( 131);
    a.add( -230);
    a.add( -871);
    a.add( -328);
    a.add( 972);
    a.add( -487);
    a.add( -468);
    a.add( -915);
    a.add( 588);
    a.add( 422);
    a.add( -127);
    a.add( 936);
    a.add( 195);
    a.add( 628);
    a.add( 175);
    a.add( 982);
    a.add( -639);
    a.add( 121);
    a.add( 555);
    a.add( -466);
    a.add( 870);
    a.add( 808);
    a.add( -211);
    a.add( 370);
    a.add( 153);
    a.add( -346);
    a.add( -580);
    a.add( -875);
    a.add( -990);
    a.add( -443);
    a.add( 965);
    a.add( 418);
    a.add( -685);
    a.add( 220);
    a.add( -302);
    a.add( 731);
    a.add( 778);
    a.add( -176);
    a.add( -269);
    a.add( -230);
    a.add( -514);
    a.add( -453);
    a.add( -323);
    a.add( 430);
    a.add( 896);
    a.add( -896);
    a.add( 30);
    a.add( 761);
    a.add( 201);
    a.add( 393);
    a.add( 612);
    a.add( 416);
    a.add( 660);
    a.add( 50);
    a.add( 899);
    a.add( 930);
    a.add( 278);
    a.add( 284);
    a.add( -147);
    a.add( -114);
    a.add( -472);
    a.add( 676);
    a.add( -965);
    a.add( -463);
    a.add( -734);
    a.add( -164);
    a.add( -862);
    a.add( 752);
    a.add( 868);
    a.add( 758);
    a.add( -86);
    a.add( -669);
    a.add( -253);
    a.add( -485);
    a.add( 440);
    a.add( -363);
    a.add( 886);
    a.add( -455);
    a.add( -901);
    a.add( 279);
    a.add( 776);
    a.add( -811);
    a.add( 297);
    a.add( 147);
    a.add( 274);
    a.add( 366);
    a.add( -59);
    a.add( 486);
    a.add( -755);
    a.add( -680);
    a.add( 33);
    a.add( -121);
    a.add( 622);
    a.add( 236);
    a.add( 301);
    a.add( 45);
    a.add( 480);
    a.add( -854);
    a.add( -215);
    a.add( -843);
    a.add( 131);
    a.add( -913);
    a.add( -518);
    a.add( 29);
    a.add( -175);
    a.add( -288);
    a.add( 752);
    a.add( 968);
    a.add( -341);
    a.add( -315);
    a.add( -974);
    a.add( -649);
    a.add( -457);
    a.add( 97);
    a.add( 574);
    a.add( 57);
    a.add( 661);
    a.add( -128);
    a.add( -467);
    a.add( 740);
    a.add( -211);
    a.add( -320);
    a.add( -734);
    a.add( -303);
    a.add( -981);
    a.add( -793);
    a.add( 180);
    a.add( -482);
    a.add( 963);
    a.add( -180);
    a.add( -391);
    a.add( -935);
    a.add( -633);
    a.add( 633);
    a.add( 92);
    a.add( -535);
    a.add( -777);
    a.add( 771);
    a.add( 421);
    a.add( 737);
    a.add( 874);
    a.add( 240);
    a.add( -762);
    a.add( 430);
    a.add( -542);
    a.add( 209);
    a.add( -388);
    a.add( 248);
    a.add( 81);
    a.add( 764);
    a.add( -987);
    a.add( 969);
    a.add( 494);
    a.add( 211);
    a.add( 460);
    a.add( 231);
    a.add( 818);
    a.add( 883);
    a.add( -838);
    a.add( -290);
    a.add( -165);
    a.add( 35);
    a.add( 982);
    a.add( 69);
    a.add( -284);
    a.add( 946);
    a.add( 223);
    a.add( -321);
    a.add( -272);
    a.add( 565);
    a.add( 859);
    a.add( 570);
    a.add( 386);
    a.add( 219);
    a.add( -850);
    a.add( 310);
    a.add( 830);
    a.add( 754);
    a.add( 798);
    a.add( -379);
    a.add( -225);
    a.add( -756);
    a.add( 272);
    a.add( 368);
    a.add( 275);
    a.add( 936);
    a.add( 940);
    a.add( 713);
    a.add( -276);
    a.add( -415);
    a.add( -953);
    a.add( -268);
    a.add( -794);
    a.add( 584);
    a.add( -901);
    a.add( 106);
    a.add( 983);
    a.add( 190);
    a.add( -483);
    a.add( 363);
    a.add( 574);
    a.add( 942);
    a.add( -90);
    a.add( -655);
    a.add( 272);
    a.add( 267);
    a.add( -456);
    a.add( 73);
    a.add( 171);
    a.add( -962);
    a.add( 505);
    a.add( 850);
    a.add( -355);
    a.add( 307);
    a.add( -182);
    a.add( -881);
    a.add( -91);
    a.add( -372);
    a.add( 489);
    a.add( -836);
    a.add( -905);
    a.add( 329);
    a.add( 223);
    a.add( -753);
    a.add( 6);
    a.add( 106);
    a.add( 509);
    a.add( 173);
    a.add( 188);
    a.add( 995);
    a.add( -214);
    a.add( 343);
    a.add( -349);
    a.add( -10);
    a.add( -481);
    a.add( -630);
    a.add( 502);
    a.add( -726);
    a.add( 321);
    a.add( -829);
    a.add( 562);
    a.add( -94);
    a.add( 783);
    a.add( -835);
    a.add( -662);
    a.add( 917);
    a.add( 850);
    a.add( 554);
    a.add( 766);
    a.add( -97);
    a.add( 672);
    a.add( 610);
    a.add( 731);
    a.add( -871);
    a.add( -394);
    a.add( 505);
    a.add( 348);
    a.add( 72);
    a.add( 6);
    a.add( 961);



    int i=solve(a);
    System.out.println(i);

  }

  public static int solve(ArrayList<Integer> A) {

    HashMap<Long,Integer> hm= new HashMap<>();
    hm.put(Long.valueOf(A.get(0)),0);
    Long prefixSum=Long.valueOf(A.get(0));


    for(int i=1;i<A.size();i++){
     // System.out.println((i)+" " +(A.get(i))+"="+(prefixSum));
      prefixSum+=A.get(i);
      if(hm.containsKey(prefixSum)|| hm.containsKey(0) || A.get(i)==0){
        return 1;
      }
      else {
        hm.put(Long.valueOf(prefixSum),i);
      }
    }
    return 0;


  }
}
