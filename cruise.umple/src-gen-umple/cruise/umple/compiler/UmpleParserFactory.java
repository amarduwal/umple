/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.18.0.3036 modeling language!*/

package cruise.umple.compiler;

/**
 * @umplesource UmpleHelper.ump 35
 * @umplesource UmpleHelper_Code.ump 123
 */
// line 35 "../../../../src/UmpleHelper.ump"
// line 123 "../../../../src/UmpleHelper_Code.ump"
public class UmpleParserFactory
{
  @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
  public @interface umplesourcefile{int[] line();String[] file();int[] javaline();int[] length();}

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleParserFactory()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

  @umplesourcefile(line={130},file={"UmpleHelper_Code.ump"},javaline={37},length={23})
   public static  UmpleParser create(String className){
    //FAST THAN REFLECTION, LOAD THE KNOWN IMPLEMENTORS
    if ("cruise.umple.compiler.UmpleInternalParser".equals(className) || "UmpleInternalParser".equals(className))
    {
      return new UmpleInternalParser();
    }
    else if ("cruise.umple.compiler.UmpleXtextParser".equals(className) || "UmpleXtextParser".equals(className))
    {
      return new UmpleXtextParser();
    }
  
    Object object = null;
    try 
    {
      Class<?> classDefinition = Class.forName(className);
      object = classDefinition.newInstance();
      return (UmpleParser)object;
    } 
    catch (Exception e) 
    { 
      return null;
    }
  }

  @umplesourcefile(line={155},file={"UmpleHelper_Code.ump"},javaline={62},length={3})
   public static  UmpleParser create(String umpleParserName, UmpleModel model){
    return create(umpleParserName,model,false);
  }

  @umplesourcefile(line={160},file={"UmpleHelper_Code.ump"},javaline={67},length={3})
   public static  UmpleParser create(String umpleParserName, boolean failHardIfInvalid){
    return create(umpleParserName,null,failHardIfInvalid);
  }

  @umplesourcefile(line={165},file={"UmpleHelper_Code.ump"},javaline={72},length={12})
   public static  UmpleParser create(String umpleParserName, UmpleModel model, boolean failHardIfInvalid){
    UmpleParser p = create(umpleParserName);
    if (p == null && failHardIfInvalid)
    {
      org.junit.Assert.fail("Unknown parser " + umpleParserName);
    }
    if (model != null)
    {
      p.setModel(model);
    }
    return p;
  }

}