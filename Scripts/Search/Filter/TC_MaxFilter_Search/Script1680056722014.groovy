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

Mobile.waitForElementPresent(findTestObject('Search/Filter/Filter Button'), 0)

'Tap tombol \'Filter\''
Mobile.tap(findTestObject('Search/Filter/Filter Button'), 0)

'Tap tombol \'Reset\''
Mobile.tap(findTestObject('Search/Filter/Reset Button'), 0)

'Tap field \'Harga Maksimum\''
Mobile.tap(findTestObject('Search/Filter/Search - Field Harga Maksimum'), 0)

'Input field \'Harga Maksimum\''
Mobile.setText(findTestObject('Search/Filter/Search - Field Harga Maksimum'), '70000', 0)

Mobile.pressBack()

'Tap tombol \'Terapkan\''
Mobile.tap(findTestObject('Search/Filter/Submit Button'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Filter Max.png', FailureHandling.CONTINUE_ON_FAILURE)

