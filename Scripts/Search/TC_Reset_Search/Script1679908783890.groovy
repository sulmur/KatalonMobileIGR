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

Mobile.startApplication(GlobalVariable.APP, false)

'Tap menu search'
Mobile.tap(findTestObject('Search/Menu Search'), 0)

'Tap field search'
Mobile.tap(findTestObject('Search/Field Search'), 0)

'Tap field cari produk'
Mobile.tap(findTestObject('Search/android.widget.EditText - Cari Produk'), 0)

'Input data produk'
Mobile.setText(findTestObject('Search/android.widget.EditText - Cari Produk (1)'), 'bendera', 0)

'Reset data field search produk'
Mobile.tap(findTestObject('Search/Reset Search (Active)'), 0)

'Tap tombol icon \'Back\''
Mobile.tap(findTestObject('Search/Keranjang Search'), 0)

