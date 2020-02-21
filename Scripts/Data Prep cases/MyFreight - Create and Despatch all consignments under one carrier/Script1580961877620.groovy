import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('MyFreight - login'), [('loginEmail') : 'davide.myfreight@gmail.com', ('loginPwd') : 'EFc/3RtcwuGANqtaSV3M6Q=='
        , ('loginPwd2') : 'Jvf9mmfhklcCEM+RmaiVtA==', ('loginEmail2') : 'david.ealdama@flexisourceit.com.au'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Data Prep cases/Myfreight - Create new despatchable consignment - for test data'), [('strReference') : 'hey'
        , ('strAddrSearchTerm') : 'Chat', ('Item1Quantity') : '2', ('Item1Length') : '22', ('Item1Width') : '24', ('Item1Height') : '15'
        , ('Item1DeadWeight') : '5', ('Item1ItemType') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/a_CONSIGNMENTS'))

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Consignments-ReadytoDespatch/span_Ready  to despatch'))

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Consignments-ReadytoDespatch/i_icon-chevron-down'))

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Consignments-ReadytoDespatch/label_checkbox-label icon-check-empty'))

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Consignments-ReadytoDespatch/button_Despatch'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('MyFreight-Users/Page_Myfreight/div_There are no consignments to display'), 1)

WebUI.closeBrowser()

