import java.util.Arrays;

class DiamondTester
{
  public static void main ( String[] args )
  {
    Fong_Diamond[] stones = new Fong_Diamond[16];
    
    stones[0] = new Fong_Diamond( "A1023", 1.0, "VS1",  'F', "brilliant");
    stones[1] = new Fong_Diamond( "A5911", 1.1, "VVS2", 'G', "rose");
    stones[2] = new Fong_Diamond( "C5427", 1.0, "VS1",  'D', "princess");
    stones[3] = new Fong_Diamond( "D8307", 1.6, "SI1",  'H', "brilliant");
    stones[4] = new Fong_Diamond( "B4825", 0.3, "I1",   'D', "rose");
    stones[5] = new Fong_Diamond( "A1844", 2.1, "VS2",  'D', "lozenge");
    stones[6] = new Fong_Diamond( "A3747", 3.1, "SI2",  'W', "baguette");
    stones[7] = new Fong_Diamond( "E6393", 2.3, "VS2",  'I', "brilliant");
    stones[8] = new Fong_Diamond( "C5619", 2.8, "VVS1", 'E', "pear");
    stones[9] = new Fong_Diamond( "E8348", 1.4, "VS2",  'G', "brilliant");
    stones[10] = new Fong_Diamond( "D2381", 1.7, "I3",   'G', "brilliant");
    stones[11] = new Fong_Diamond( "C9253", 1.3, "VS2",  'H', "baguette");
    stones[12] = new Fong_Diamond( "G3459", 2.1, "VS2",  'H', "rose");
    stones[13] = new Fong_Diamond( "B3598", 2.4, "VVS2", 'D', "pear");
    stones[14] = new Fong_Diamond( "D9836", 2.8, "IF",   'E', "princess");
    stones[15] = new Fong_Diamond( "E1046", 2.2, "FL",   'E', "rose");
       
    Arrays.sort( stones );
    
    for ( int j=0; j<stones.length; j++ )
      System.out.println( stones[j].toString() );
  }  

}