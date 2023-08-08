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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ui-sit-b2b.bhakti.co.id/auth/login/phoenix')

WebUI.setText(findTestObject('Object Repository/tc003-warehouseassetsave/input_Username or Email_email'), 'komaruddin.skom@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/tc003-warehouseassetsave/input_Password_password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/tc003-warehouseassetsave/button_Sign In'))

WebUI.click(findTestObject('Object Repository/tc003-warehouseassetsave/button_Master chevron_right'))

WebUI.click(findTestObject('Object Repository/tc003-warehouseassetsave/button_Warehouse chevron_right'))

WebUI.click(findTestObject('Object Repository/tc003-warehouseassetsave/span_Warehouse Asset'))

WebUI.click(findTestObject('Object Repository/tc003-warehouseassetsave/mat-icon_note_add'))

WebUI.setText(findTestObject('Object Repository/tc003-warehouseassetsave/input_Warehouse Asset Name_mat-input-1'), 'PTKKATALONCASE')

WebUI.click(findTestObject('Object Repository/tc003-warehouseassetsave/mat-select_Choose Branch'))

WebUI.click(findTestObject('Object Repository/tc003-warehouseassetsave/div_Choose Branch_mat-select-arrow-wrapper _dfeca0'))

WebUI.click(findTestObject('Object Repository/tc003-warehouseassetsave/span_PONTIANAK'))

WebUI.setText(findTestObject('Object Repository/tc003-warehouseassetsave/textarea_Remarks_mat-input-2'), '001')

WebUI.click(findTestObject('Object Repository/tc003-warehouseassetsave/div_saveSave'))

WebUI.click(findTestObject('Object Repository/tc003-warehouseassetsave/span_Back to List'))

WebUI.click(findTestObject('Object Repository/tc003-warehouseassetsave/td_WH-ASSET-PTK-0001'))

WebUI.click(findTestObject('Object Repository/tc003-warehouseassetsave/div_Back to List'))

WebUI.click(findTestObject('Object Repository/tc003-warehouseassetsave/span_Dashboard'))

WebUI.click(findTestObject('Object Repository/tc003-warehouseassetsave/div_Created with Sketch_loading-indicator'))

WebUI.click(findTestObject('Object Repository/tc003-warehouseassetsave/span_KOMARUDIN'))

WebUI.click(findTestObject('Object Repository/tc003-warehouseassetsave/a_Sign Out'))

WebUI.closeBrowser()

