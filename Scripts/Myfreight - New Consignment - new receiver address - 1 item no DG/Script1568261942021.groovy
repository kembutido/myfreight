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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('MyFreight - login'), [('loginEmail') : 'davide.myfreight@gmail.com', ('loginPwd') : 'EFc/3RtcwuGANqtaSV3M6Q=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/a_CONSIGNMENTS'))

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/button_New'))

WebUI.delay(1)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_REFERENCE_REFERENCE'), strReference)

//WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_DESPATCH DATE_despatch_d'), GlobalVariable.despatchDate)
WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/a_Add'), 5)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/a_Add'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/modal_form'), 1)

WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/input_Customer Reference_code'), 5)

String ts = System.currentTimeMillis().toString()

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_Customer Reference_code'), 'Ref' + ts)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_Customer Name_name'), 'Cust' + ts)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_Email_email'), 'myhome@truhome.io')

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_Address Line 1_address_l'), '143 Happy Place')

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_Address Line 2_address_l'), 'Trafalgar North wing')

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_Address Line 3_address_l'), '6th Ring rd')

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_Address Line 4_address_l'), '5th left turn')

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_suburb, town or city_locality'), '5022')

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/div_firstpostcodematch_dropdown'))

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/btn_modal_Save'))

WebUI.delay(1)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_QUANTITY'), Item1Quantity)

WebUI.selectOptionByIndex(findTestObject('MyFreight-Users/Page_Myfreight/select_ItemType'), '1')

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_LENGTH'), Item1Length)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_WIDTH'), Item1Width)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_HEIGHT'), Item1Height)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_DEAD WEIGHT'), Item1DeadWeight)

WebUI.delay(3)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/button_Save'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/a_CONSIGNMENTS'), 5)

WebUI.delay(1)

WebUI.takeScreenshot(('Test/newreceiveraddrnodg' + ts) + '.png')

WebUI.closeBrowser()

