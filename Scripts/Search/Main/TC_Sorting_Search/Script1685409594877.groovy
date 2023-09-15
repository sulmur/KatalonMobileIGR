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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

Mobile.callTestCase(findTestCase('Search/TC_Search_Button'), [:], FailureHandling.STOP_ON_FAILURE)

'Tap field \'search\''
Mobile.tap(findTestObject('Search/Field Search'), 0)

'input data pada field \'search\''
Mobile.setText(findTestObject('Search/Field Search'), 'anlene', 0)

Mobile.waitForElementPresent(findTestObject('Search/Produk/anlene'), 0)

Mobile.takeScreenshot('Reports/Suggestion Product.png')

'Tap salah satu suggestion produk yang muncul dari hasil search'
Mobile.tap(findTestObject('Search/Produk/anlene'), 0)

Mobile.swipe(100, 900, 0, 0)

Mobile.callTestCase(findTestCase('Search/Sorting/TC_A-Z_Sort_Search'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Search/Sorting/TC_Z-A_Sort_Search'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Search/Sorting/TC_Lowest_Sort_Search'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Search/Sorting/TC_Highest_Sort_Search'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Search/Sorting/TC_Cancel_Sort_Search'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

