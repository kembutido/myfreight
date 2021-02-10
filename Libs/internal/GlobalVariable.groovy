package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object TestConsNum
     
    /**
     * <p></p>
     */
    public static Object loginurl
     
    /**
     * <p></p>
     */
    public static Object despatchDate
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            TestConsNum = selectedVariables['TestConsNum']
            loginurl = selectedVariables['loginurl']
            despatchDate = selectedVariables['despatchDate']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
