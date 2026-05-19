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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Click 'Add' to create new user; redirect to adduser page
WebUI.click(findTestObject('Object Repository/adminDashboard/btn_newUser'))

// Input employee name
WebUI.setText(findTestObject('Object Repository/addUserPage/txt_employeeName'), 'Peter Mac Anderson')
WebUI.click(findTestObject('Object Repository/addUserPage/txt_employeeName'))
WebUI.waitForElementPresent(findTestObject('Object Repository/addUserPage/div_Peter Mac Anderson'), 0, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/addUserPage/div_Peter Mac Anderson'))

// Input username
WebUI.setText(findTestObject('Object Repository/addUserPage/txt_username'), 'sampleUser01')

// Input password & confirmation
WebUI.setEncryptedText(findTestObject('Object Repository/addUserPage/txt_password'), 'Bg9E9al4B505jTMqFLODjA==')
WebUI.setEncryptedText(findTestObject('Object Repository/addUserPage/txt_confirmPassword'), 'Bg9E9al4B505jTMqFLODjA==')

// Input dropdown - status
WebUI.click(findTestObject('Object Repository/addUserPage/drp_status'))
WebUI.click(findTestObject('Object Repository/addUserPage/div_Enabled'))


// Input dropdown - userRole
WebUI.click(findTestObject('Object Repository/addUserPage/drp_userRole'))
WebUI.click(findTestObject('Object Repository/addUserPage/div_Admin'))

// Confirm created user - save button
WebUI.click(findTestObject('Object Repository/addUserPage/btn_save'))

// Await confirmation popup
WebUI.waitForElementPresent(findTestObject('Object Repository/addUserPage/div_SuccessSuccessfully Saved'), 0, FailureHandling.STOP_ON_FAILURE)


