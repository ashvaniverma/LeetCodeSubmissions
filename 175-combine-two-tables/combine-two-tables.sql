select p.firstName,p.lastName,a.city,a.State from Person p Left JOIN Address a ON p.personId=a.personId;
