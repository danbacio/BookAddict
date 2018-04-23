/*********************************************************************************************************
* BOOK ADDICT                                                                                  *
* ------------------------------------------------------------------------------------------------------ *
*                                                                            *
*                                                                                                        *
*********************************************************************************************************/

USE book_addict;

CREATE TABLE IF NOT EXISTS BA_POSTS  (
    ID INT auto_increment,
    USER_ID INT NOT NULL,
    TITLE VARCHAR(200) NOT NULL,
    POST VARCHAR(2000) NOT NULL,
    CONSTRAINT  PK_USERS  PRIMARY KEY (ID),
    FOREIGN KEY (USER_ID) REFERENCES BA_USERS(ID_USER)
);

--== INSERT DUMMY CATEGORIES
DELETE FROM BA_POSTS;

INSERT INTO BA_POSTS
VALUES(
1,
1,
'cum faci ceea ce faci?',
'sa faci sau sa nu faci.'
);