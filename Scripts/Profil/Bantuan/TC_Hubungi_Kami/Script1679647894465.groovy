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

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap menu \'Hubungi Kami\''
Mobile.tap(findTestObject('Profil/Bantuan/Hubungi Kami'), 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Hubungi Kami.png', FailureHandling.CONTINUE_ON_FAILURE)

'Tap "Bantuan HP"'
Mobile.tap(findTestObject('Profil/Bantuan/Hubungi IGR/Bantuan HP'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Hubungi Telepon.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.pressBack()

Mobile.pressBack()

'Tap "Bantuan WA"'
Mobile.tap(findTestObject('Profil/Bantuan/Hubungi IGR/Bantuan WA'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Hubungi WA.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.pressBack()

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

