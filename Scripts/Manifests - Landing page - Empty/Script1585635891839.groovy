import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('MyFreight - login'), [('loginEmail') : 'davide.myfreight@gmail.com', ('loginPwd') : 'EFc/3RtcwuGANqtaSV3M6Q=='
        , ('loginPwd2') : 'Jvf9mmfhklcCEM+RmaiVtA==', ('loginEmail2') : 'david.ealdama@flexisourceit.com.au'], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/a_MANIFESTS'))

WebUI.waitForPageLoad(2)

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/Manifests/select_site-name'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/Manifests/input_date_filter_from_date'))

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/Manifests/input_date_filter_to_date'))

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/Manifests/div_There are no manifests to display'))

WebUI.verifyElementNotClickable(findTestObject('MyFreight-Users/Page_Myfreight/Manifests/button_Print Con Note'))

WebUI.verifyElementNotClickable(findTestObject('MyFreight-Users/Page_Myfreight/Manifests/button_Print Manifests'))
WebUI.delay(1)

String ts = System.currentTimeMillis().toString()

WebUI.takeScreenshot(('Test/ManifestsLandingpageEmpty-' + ts) + '.png')

WebUI.closeBrowser()
