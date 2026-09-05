# Step_semester_3

STEP Semester 3 coursework repository containing weekly practice problems, assignment solutions, and session-wise Java implementations following the prescribed GitHub branching and package structure.

## Date: 05-09-2026

**Today's Work:**
- Completed Session 5: Access Modifiers, Encapsulation & Object Modeling.
- Solved 5 Practice Problems (`w5 1.pdf` – Category B in-class problems):
  1. Movie Ticket Field Visibility Checker – `classifyAccess()` implementing all 4 Java access modifier rules across SAME_CLASS / SAME_PACKAGE / DIFFERENT_PACKAGE contexts
  2. Subclass Ticket Access (extended AccessChecker) – extended with SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE and SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE contexts for `protected` cross-package inheritance rules
  3. Seat Booking Encapsulation Guard (`CineScreen`) – private fields, constructor-time validation, boundary-safe `bookSeat()` / `cancelBooking()` with silent rejection
  4. `MovieBookingProfile` JavaBean & OTP Property – JavaBean compliant getX/setX/isX, convenience constructor with `this()` chaining, write-only OTP property (setter with no getter)
  5. Immutable Booking Receipt & Nightly Settlement – `final` class + `final` fields, defensive copy in/out on `seatNumbers`, "wither" pattern via `withUpdatedSeat()`, `instanceof`-based batch dispatch with null-safety
- Solved 5 Assignment Problems (`w5 2.pdf` – Category B homework):
  1. Membership Field Reach Checker (`MembershipAccessChecker`) – same access-modifier logic applied to `LibraryMember` fields
  2. Reference Desk Subclass Reach (extended `MembershipAccessChecker`) – protected cross-package subclass contexts for `LibraryMember` inheritance
  3. Book Copy Circulation Guard (`BookInventoryGuard`) – private `copiesTotal`/`copiesAvailable`, constructor validation, boundary-safe `checkoutBook()` / `returnBook()`
  4. `LibraryMemberBean` JavaBean & Security Answer Property – write-once `membershipId` (silently ignores second call), `isPremiumMember()` boolean getter, write-only `securityAnswer` stored as one-way hash
  5. Immutable Loan Receipt & Nightly Circulation Ledger – `final` class + `final` fields + defensive copy, `withCorrectedBookId()` wither, static block in `CirculationLedger`, `instanceof` dispatch for `ReferenceOnlyLoanReceipt`, null-safe batch processing

**Next Session Plan:**
- All available Semester 3 coursework sessions (Sessions 1–5) are completed.

**Issues Faced:**
- None.

## Date: 05-09-2026

**Today's Work:**
- Completed Session 4: Constructors & Access Modifiers / Object Modeling.
- Solved 5 Practice Problems:
  1. Library Book Cataloguing (Constructor Chaining `this()`)
  2. Payroll Batch Bonus Round
  3. Late Fees – Skip the On-Time Accounts
  4. One-Time College Setup, Many Students (Static Block)
  5. Account Batch Payments (`instanceof` Polymorphism)
- Solved 5 Assignment Problems:
  1. Overloaded Constructors for Hackathon Registration
  2. `this` Keyword for Canteen Inventory – Batch Restock
  3. `final` Method – Parking Overstay Fine Calculator
  4. Static Block – Library Membership Card Setup
  5. `instanceof` Inside a Loop – Canteen Closing-Time Payment Dispatch

**Next Session Plan:**
- Session 5: Access Modifiers, Encapsulation & Object Modeling (5 Practice Problems + 5 Assignment Problems).

**Issues Faced:**
- None.

## Date: 05-09-2026

**Today's Work:**
- Completed Session 3: OOP, Classes and Objects.
- Solved 5 Practice Problems:
  1. From Parallel Arrays to a Class (Student Placement Tracker)
  2. Encapsulated Mess-Card Wallet
  3. Overloaded Constructors for a Course
  4. Reference Copies and a Shared ID Card
  5. Instance vs Static: Splitting a Class Correctly
- Solved 5 Assignment Problems:
  1. From Parallel Arrays to a Class – Library Inventory
  2. Encapsulated Payroll Account
  3. Overloaded Constructors for an Employee
  4. Reference Copies and a Shared Exam Hall Ticket
  5. Instance vs Static: Splitting an Employee Class Correctly

**Next Session Plan:**
- Session 4: Constructors & Access Modifiers / Object Modeling (5 Practice Problems + 5 Assignment Problems).

**Issues Faced:**
- None.

## Date: 05-09-2026

**Today's Work:**
- Completed Session 2: String Operations & Manipulation.
- Solved 5 Practice Problems:
  1. Vowel & Consonant Counter
  2. CSV Student Record Parser
  3. File Extension Validator
  4. Masked Phone Number Formatter
  5. Bank Transaction Reference Generator & Validator
- Solved 5 Assignment Problems:
  1. ATM PIN Length Validator
  2. Word Reversal Encoder
  3. Product Inventory CSV Parser
  4. Library ISBN Normalizer & Validator
  5. Stop-Word-Filtered Word Frequency Report

**Next Session Plan:**
- Session 3: OOP, Classes and Objects (5 Practice Problems + 5 Assignment Problems).

**Issues Faced:**
- None.

## Date: 05-09-2026

**Today's Work:**
- Completed Session 1: Java Strings.
- Solved 5 Practice Problems:
  1. Rock-Paper-Scissors Game
  2. Palindrome Checker (3 Approaches)
  3. BMI Calculator for a Team
  4. First Non-Repeating Character
  5. Reverse Customer Name
- Solved 5 Assignment Problems:
  1. The Exam Hall Seat Duplication Checker
  2. The Typing Speed Test Accuracy Checker
  3. The Traffic Signal Streak Analyzer
  4. The Warehouse Inventory Balancer
  5. The Movie Review Word Length Profiler

**Next Session Plan:**
- Session 2: String Operations & Manipulation (5 Practice Problems + 5 Assignment Problems).

**Issues Faced:**
- Initial GitHub push authentication 403 error, resolved by updating credentials.
