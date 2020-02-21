import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.List as List
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

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/a_CONSIGNMENTS'))

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/button_New'))

WebUI.delay(1)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_REFERENCE_REFERENCE'), strReference)

//WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_DESPATCH DATE_despatch_d'), GlobalVariable.despatchDate)
WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_RECEIVER DETAILS_Receive'), strAddrSearchTerm)

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/a_Address_dropdown_item1'))

WebUI.delay(2)

if (WebUI.verifyElementNotPresent(findTestObject('MyFreight-Users/Page_Myfreight/MergeConsignment/h2_Merge Consignment'), 
    5, FailureHandling.OPTIONAL)) {
    WebUI.delay(1)
} else {
    WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/MergeConsignment/button_Cancel'))
}

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_QUANTITY'), Item1Quantity)

WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/select_ItemType'), 3)

WebUI.selectOptionByIndex(findTestObject('MyFreight-Users/Page_Myfreight/select_ItemType'), Item1ItemType, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_LENGTH'), Item1Length)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_WIDTH'), Item1Width)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_HEIGHT'), Item1Height)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_DEAD WEIGHT'), Item1DeadWeight)

'wait for the carrier selection to be populated - code can be improved'
WebUI.delay(2)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/a_CONSIGNMENTS'))

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Consignments Landing/a_labels-to-print-link active'))

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Consignments Landing/div_span1 chevron'))

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Consignments Landing/label_checkbox-label icon-check-empty'))

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Consignments Landing/button_Print Labels'))

'applicable for non-IE browsers, IE browsers should ignore this line'
WebUI.closeWindowIndex(1, FailureHandling.OPTIONAL)

WebUI.switchToWindowIndex(0)

