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

WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/a_QUOTES'), 2)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/a_QUOTES'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('MyFreight-Users/Page_Myfreight/Quotes/div_QuotesThere are no quotes to display'), 
    1, FailureHandling.STOP_ON_FAILURE)

