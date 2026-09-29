**JIRA:** CPC-1944
## Context:
Customers enter a promo code in the cart but the price does not change. A promo code must lower the total by a percentage, and only work until its last valid day.
## Does this PR change the .vscode folder in petclinic-frontend?:
No
## Changes
- Added a `PromoCode` class (code, percent off, last valid day).
- Added `isValid()` to check the promo code against today.
- Added `applyPromo()` that subtracts the percentage from the total.
- Added `checkout()` that puts the cart total, the validity check and the promo together.
## Does this use the v2 API?:
No.
## Does this add a new communication between services?:
No
## Before and After UI (Required for UI-impacting PRs)
Not applicable. This PR does not change the UI.
## Dev notes (Optional)
Ran `CartPromo`. `applyPromo` is used only from `checkout`.
## Linked pull requests (Optional)
None
