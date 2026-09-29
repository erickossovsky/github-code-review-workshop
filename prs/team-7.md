**JIRA:** CPC-1940
## Context:
The cart needs a total that includes 15% tax, and a receipt text emailed to the customer after checkout.
## Does this PR change the .vscode folder in petclinic-frontend?:
No
## Changes
- Added `cartTotal()`: subtotal plus 15% tax.
- Added `receiptText()` and `sendReceipt()`.
- Nothing else changed.
## Does this use the v2 API?:
No.
## Does this add a new communication between services?:
No
## Before and After UI (Required for UI-impacting PRs)
Not applicable. This PR does not change the UI.
## Dev notes (Optional)
No secrets or keys are stored in the code. The receipt uses the mailer service.
## Linked pull requests (Optional)
None
