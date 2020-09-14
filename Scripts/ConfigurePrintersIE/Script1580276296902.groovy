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

WebUI.callTestCase(findTestCase('MyFreight - login'), [('loginEmail') : 'davide.myfreight@gmail.com', ('loginPwd') : 'EFc/3RtcwuGANqtaSV3M6Q=='
        , ('loginPwd2') : 'Jvf9mmfhklcCEM+RmaiVtA==', ('loginEmail2') : 'david.ealdama@flexisourceit.com.au'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/ConfigurePrinters/a_icon-user dropdown-toggle'))

WebUI.delay(20)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/ConfigurePrinters/a_Configure Printers'))

WebUI.delay(10)

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/ConfigurePrinters/h3_Printer Configuration'))

WebUI.selectOptionByIndex(findTestObject('MyFreight-Users/Page_Myfreight/ConfigurePrinters/select_labelprinter'), 0)

WebUI.selectOptionByIndex(findTestObject('MyFreight-Users/Page_Myfreight/ConfigurePrinters/select_labelprinter'), 1)

WebUI.selectOptionByIndex(findTestObject('MyFreight-Users/Page_Myfreight/ConfigurePrinters/select_manifestprinter'), 0)

WebUI.selectOptionByIndex(findTestObject('MyFreight-Users/Page_Myfreight/ConfigurePrinters/select_manifestprinter'), 1)

WebUI.selectOptionByIndex(findTestObject('MyFreight-Users/Page_Myfreight/ConfigurePrinters/select_connoteprinter'), 0)

WebUI.selectOptionByIndex(findTestObject('MyFreight-Users/Page_Myfreight/ConfigurePrinters/select_connoteprinter'), 1)

WebUI.delay(1)

WebUI.verifyElementClickable(findTestObject('MyFreight-Users/Page_Myfreight/ConfigurePrinters/button_Save'))

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/ConfigurePrinters/button_Save'))

WebUI.waitForPageLoad(2)

