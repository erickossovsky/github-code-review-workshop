# Facilitator guide (do not share with students)

Every exercise is a tiny Java file based on a real PetClinic ticket. Java 17 is what PetClinic uses.

## Timing (20 min)

| Min | What |
|-----|------|
| 0-2 | Teams of 2-4. Hand out team numbers. Everyone opens the repo README. |
| 2-7 | Authors open the PR. Reviewers read the ticket. |
| 7-17 | Reviewers run it and comment. Walk the room. |
| 17-20 | Authors reply. Two teams read their best comment aloud. |

## Setup checklist (before class)

1. Create the repo `github-workshop` (public), push `main` and all `team-*` branches.
2. Add every student as a collaborator with **Write** access (they need it to open PRs in the same repo
   and to commit fixes). Or have each team fork the repo.
3. Settings, Actions: allow workflows for pull requests.
4. Test once: open a PR from `team-1` into `main` and check that the **Run it** check prints output.

## Answer key

| Team | File | Ticket | What is planted | Best verdict | Model comment |
|------|------|--------|-----------------|--------------|---------------|
| 1 | `BillAverage.java` | BILL-CPC-1988 | Divides by `length + 1`. Prints 15.0, expected 20.0. | Request changes | `blocking:` averageBill({10, 20, 30}) returns 15.0, expected 20.0. Every average shown to customers is wrong. Divide by `amounts.length`. |
| 2 | `BillPayment.java` | BILL-CPC-1987 | The check is inverted (`equals("PAID")`). UNPAID bills cannot be paid, PAID ones can. | Request changes | `blocking:` canPay("PAID") returns true, so a paid bill can be paid again and the owner is charged twice. Return `!status.equals("PAID")`. |
| 3 | `CartPromo.java` | CART-CPC-1944 | Integer division: `percentOff / 100` is 0, so the promo does nothing. Prints 50.0, expected 45.0. | Request changes | `blocking:` applyPromo(50.0, 10) returns 50.0, expected 45.0. Customers never get their discount. Use `percentOff / 100.0`. |
| 4 | `OwnerWelcome.java` | CUST-CPC-1953 | It works. Only nits: unused `import java.util.List`, a commented-out debug line, misspelled variable `mesage`. | **Approve** with nits | `nit:` `java.util.List` is imported and never used. Remove it. |
| 5 | `PasswordCheck.java` | AUTH-CPC-1973 | Works, but prints the password to the console. | Request changes | `blocking:` the method prints the password. Anyone reading the logs sees it. Delete the println. |
| 6 | `VisitStatus.java` | VIST-CPC-1954 | Edge case: `>` should be `>=`. A visit today shows PAST. Only shows when you run with visitDay == today. | Request changes | `blocking:` visitStatus(10, 10) returns PAST, expected UPCOMING. Visits happening today look finished. Use `>=`. |
| 7 | `CartTotal.java` | CART-CPC-1940 | Works, but a mailer API key is hard-coded in the file. | Request changes | `blocking:` a secret key (`MAILER_API_KEY`) is committed. Anyone with repo access can use it. Load it from an environment variable. |
| 8 | `LowStock.java` | INVT-CPC-1996 | Edge case: `<= 5` should be `< 5`. Prints 3, expected 1. | Request changes | `blocking:` countLowStock({1, 5, 9, 5}) returns 3, expected 1. Products with exactly 5 are not low stock. Use `< 5`. |

Suggested PR titles (PetClinic style) are in the branch commit messages, for example `bug(BILL-CPC-1987): only unpaid bills can be paid`.

Team 4 is the "not everything is a blocker" team. Watch that they do not Request changes over nits.
Teams 6 and 8 only fail on an edge value, so reviewers who only try the easy case will miss it.
Teams 5 and 7 print correct results, so running the code is not enough: the problem is visible only by reading.

## Coaching questions

- "Did you run it, or did you read it?"
- "Could the author fix this without asking you a question?"
- "Is this a nit or a blocker? What happens if it stays?"
- "Find the maybe in your comment and delete it."
- "Where is the impact? Who does this hurt?"

## Wrap-up (last 2 min)

Ask two reviewers to read their best comment out loud. Ask the class: did it have a label? problem, impact, solution?
