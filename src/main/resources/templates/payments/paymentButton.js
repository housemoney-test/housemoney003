/**
 *
 */

const incomeButton = document.getElementById("incomeButton");
const spendingButton = document.getElementById("spendingButton");
const incomeForm = document.getElementById("incomeForm");
const spendingForm = document.getElementById("spendingForm");

incomeButton.disabled = true;
spendingForm.style.visibility = "hidden";

function clickIncome() {
	spendingForm.style.visibility = "hidden";
	incomeForm.style.visibility = "visible";
	spendingButton.disabled = false;
	incomeButton.disabled = true;
}

function clickSpending() {
	incomeForm.style.visibility = "hidden";
	spendingForm.style.visibility = "visible";
	incomeButton.disabled = false;
	spendingButton.disabled = true;
}