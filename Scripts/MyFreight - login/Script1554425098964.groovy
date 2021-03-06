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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser(GlobalVariable.loginurl)

WebUI.waitForPageLoad(2, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/input_Email_email'))

'if login is not working in QA, check if user exists in Client\'s Users page. most likely \r\nit\'s been removed by a recent Prod sync.\r\nIf it\'s not working in IE only, need to update Katalon to the latest version.'
WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_Email_email'), loginEmail)

'If IE11 has problems logging in, \r\nput delay above, set to 30 seconds, do what you need in IE, save and done.\r\nJ1Z4VqvEaK'
WebUI.setEncryptedText(findTestObject('MyFreight-Users/Page_Myfreight/input_password'), loginPwd)

//WebUI.setEncryptedText(findTestObject('MyFreight-Users/Page_Myfreight/input_password'), loginPwd)
WebUI.delay(2)

WebUI.submit(findTestObject('MyFreight-Users/Page_Myfreight/button_Sign in'))

WebUI.delay(5)

WebUI.waitForPageLoad(1)

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/a_CONSIGNMENTS'))

WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/a_CONSIGNMENTS'), 0)

