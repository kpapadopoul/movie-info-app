--
-- PostgreSQL database dump
--

-- Dumped from database version 12.1
-- Dumped by pg_dump version 12.1

-- Started on 2019-12-17 13:47:59

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 203 (class 1259 OID 16727)
-- Name: countries; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.countries (
    id integer NOT NULL,
    name character varying(45),
    code character varying(2)
);


ALTER TABLE public.countries OWNER TO postgres;

--
-- TOC entry 207 (class 1259 OID 16815)
-- Name: currently_in_theaters; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.currently_in_theaters (
    id integer NOT NULL,
    country integer,
    movie integer,
    date timestamp without time zone
);


ALTER TABLE public.currently_in_theaters OWNER TO postgres;

--
-- TOC entry 208 (class 1259 OID 16832)
-- Name: hibernate_sequence; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.hibernate_sequence OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 16722)
-- Name: movies; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.movies (
    id integer NOT NULL,
    name character varying(45),
    director integer,
    country_produced integer
);


ALTER TABLE public.movies OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 16804)
-- Name: movies_count; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.movies_count (
    id integer NOT NULL,
    year integer,
    month integer,
    country integer,
    no_movies integer
);


ALTER TABLE public.movies_count OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 16764)
-- Name: people; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.people (
    id integer NOT NULL,
    first_name character varying(45),
    last_name character varying(45),
    country integer
);


ALTER TABLE public.people OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 16775)
-- Name: reviews; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.reviews (
    id integer NOT NULL,
    author integer,
    movie integer,
    rate double precision,
    text character(256)
);


ALTER TABLE public.reviews OWNER TO postgres;

--
-- TOC entry 2862 (class 0 OID 16727)
-- Dependencies: 203
-- Data for Name: countries; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.countries (id, name, code) FROM stdin;
1	United States	US
2	United Kingdom	GB
3	Canada	CA
4	Greece	GR
\.


--
-- TOC entry 2866 (class 0 OID 16815)
-- Dependencies: 207
-- Data for Name: currently_in_theaters; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.currently_in_theaters (id, country, movie, date) FROM stdin;
1	1	512200	2019-12-16 11:54:23.637
2	1	330457	2019-12-16 11:54:23.638
3	1	492188	2019-12-16 11:54:23.638
5	1	546554	2019-12-16 11:54:23.638
6	1	290859	2019-12-16 11:54:23.638
7	1	501170	2019-12-16 11:54:23.638
8	1	551808	2019-12-16 11:54:23.638
9	1	359724	2019-12-16 11:54:23.638
10	1	473033	2019-12-16 11:54:23.638
11	1	292011	2019-12-16 11:54:23.638
12	1	461130	2019-12-16 11:54:23.638
13	1	508965	2019-12-16 11:54:23.638
14	1	549053	2019-12-16 11:54:23.638
15	1	592128	2019-12-16 11:54:23.638
16	1	458897	2019-12-16 11:54:23.638
17	1	522162	2019-12-16 11:54:23.638
18	1	403300	2019-12-16 11:54:23.638
19	1	508664	2019-12-16 11:54:23.638
20	1	535292	2019-12-16 11:54:23.638
21	2	512200	2019-12-16 11:54:23.638
22	2	330457	2019-12-16 11:54:23.638
23	2	492188	2019-12-16 11:54:23.638
24	2	398978	2019-12-16 11:54:23.638
25	2	546554	2019-12-16 11:54:23.638
26	2	501170	2019-12-16 11:54:23.638
27	2	551808	2019-12-16 11:54:23.638
28	2	359724	2019-12-16 11:54:23.638
29	2	508965	2019-12-16 11:54:23.638
30	2	549053	2019-12-16 11:54:23.638
31	2	577332	2019-12-16 11:54:23.638
32	2	458897	2019-12-16 11:54:23.638
33	2	522162	2019-12-16 11:54:23.638
34	2	535292	2019-12-16 11:54:23.638
35	2	588787	2019-12-16 11:54:23.638
36	2	576692	2019-12-16 11:54:23.638
37	2	641370	2019-12-16 11:54:23.638
38	2	641336	2019-12-16 11:54:23.638
39	2	588531	2019-12-16 11:54:23.638
40	2	524348	2019-12-16 11:54:23.638
41	3	512200	2019-12-16 11:54:23.638
42	3	330457	2019-12-16 11:54:23.638
43	3	509967	2019-12-16 11:54:23.638
44	3	546554	2019-12-16 11:54:23.638
45	3	290859	2019-12-16 11:54:23.639
46	3	359724	2019-12-16 11:54:23.639
47	3	461130	2019-12-16 11:54:23.639
48	3	508965	2019-12-16 11:54:23.639
49	3	549053	2019-12-16 11:54:23.639
50	3	458897	2019-12-16 11:54:23.639
51	3	522162	2019-12-16 11:54:23.639
52	3	366668	2019-12-16 11:54:23.639
53	3	638695	2019-12-16 11:54:23.639
54	3	501907	2019-12-16 11:54:23.639
55	3	416153	2019-12-16 11:54:23.639
56	3	512263	2019-12-16 11:54:23.639
57	3	595975	2019-12-16 11:54:23.639
58	3	592480	2019-12-16 11:54:23.639
59	3	497322	2019-12-16 11:54:23.639
60	3	652467	2019-12-16 11:54:23.639
61	4	512200	2019-12-16 11:54:23.639
62	4	330457	2019-12-16 11:54:23.639
63	4	492188	2019-12-16 11:54:23.639
64	4	398978	2019-12-16 11:54:23.639
65	4	546554	2019-12-16 11:54:23.639
66	4	290859	2019-12-16 11:54:23.639
67	4	501170	2019-12-16 11:54:23.639
68	4	359724	2019-12-16 11:54:23.639
69	4	549053	2019-12-16 11:54:23.639
70	4	458897	2019-12-16 11:54:23.639
71	4	522162	2019-12-16 11:54:23.639
72	4	535292	2019-12-16 11:54:23.639
73	4	338967	2019-12-16 11:54:23.639
74	4	519010	2019-12-16 11:54:23.639
75	4	554241	2019-12-16 11:54:23.639
76	4	511322	2019-12-16 11:54:23.639
77	4	482981	2019-12-16 11:54:23.639
78	4	513413	2019-12-16 11:54:23.639
79	4	586863	2019-12-16 11:54:23.639
80	4	498248	2019-12-16 11:54:23.639
81	1	512200	2019-12-16 11:56:11.211
82	1	330457	2019-12-16 11:56:11.212
83	1	492188	2019-12-16 11:56:11.212
84	1	398978	2019-12-16 11:56:11.212
85	1	546554	2019-12-16 11:56:11.212
86	1	290859	2019-12-16 11:56:11.212
87	1	501170	2019-12-16 11:56:11.212
88	1	551808	2019-12-16 11:56:11.212
89	1	359724	2019-12-16 11:56:11.212
90	1	473033	2019-12-16 11:56:11.212
91	1	292011	2019-12-16 11:56:11.212
92	1	461130	2019-12-16 11:56:11.212
93	1	508965	2019-12-16 11:56:11.212
94	1	549053	2019-12-16 11:56:11.212
95	1	592128	2019-12-16 11:56:11.212
96	1	458897	2019-12-16 11:56:11.212
97	1	522162	2019-12-16 11:56:11.212
98	1	403300	2019-12-16 11:56:11.212
99	1	508664	2019-12-16 11:56:11.212
100	1	535292	2019-12-16 11:56:11.212
101	2	512200	2019-12-16 11:56:11.212
102	2	330457	2019-12-16 11:56:11.212
103	2	492188	2019-12-16 11:56:11.212
104	2	398978	2019-12-16 11:56:11.212
105	2	546554	2019-12-16 11:56:11.212
106	2	501170	2019-12-16 11:56:11.212
107	2	551808	2019-12-16 11:56:11.212
108	2	359724	2019-12-16 11:56:11.212
109	2	508965	2019-12-16 11:56:11.212
110	2	549053	2019-12-16 11:56:11.212
111	2	577332	2019-12-16 11:56:11.212
112	2	458897	2019-12-16 11:56:11.212
113	2	522162	2019-12-16 11:56:11.212
114	2	535292	2019-12-16 11:56:11.212
115	2	588787	2019-12-16 11:56:11.212
116	2	576692	2019-12-16 11:56:11.212
117	2	641370	2019-12-16 11:56:11.212
118	2	641336	2019-12-16 11:56:11.212
119	2	588531	2019-12-16 11:56:11.212
120	2	524348	2019-12-16 11:56:11.212
121	3	512200	2019-12-16 11:56:11.212
122	3	330457	2019-12-16 11:56:11.212
123	3	509967	2019-12-16 11:56:11.212
124	3	546554	2019-12-16 11:56:11.212
125	3	290859	2019-12-16 11:56:11.212
126	3	359724	2019-12-16 11:56:11.212
127	3	461130	2019-12-16 11:56:11.212
128	3	508965	2019-12-16 11:56:11.212
129	3	549053	2019-12-16 11:56:11.212
130	3	458897	2019-12-16 11:56:11.212
131	3	522162	2019-12-16 11:56:11.212
132	3	366668	2019-12-16 11:56:11.212
133	3	638695	2019-12-16 11:56:11.212
134	3	501907	2019-12-16 11:56:11.213
135	3	416153	2019-12-16 11:56:11.213
136	3	512263	2019-12-16 11:56:11.213
137	3	595975	2019-12-16 11:56:11.213
138	3	592480	2019-12-16 11:56:11.213
139	3	497322	2019-12-16 11:56:11.213
140	3	652467	2019-12-16 11:56:11.213
141	4	512200	2019-12-16 11:56:11.213
142	4	330457	2019-12-16 11:56:11.213
143	4	492188	2019-12-16 11:56:11.213
144	4	398978	2019-12-16 11:56:11.213
145	4	546554	2019-12-16 11:56:11.213
146	4	290859	2019-12-16 11:56:11.213
147	4	501170	2019-12-16 11:56:11.213
148	4	359724	2019-12-16 11:56:11.213
149	4	549053	2019-12-16 11:56:11.213
150	4	458897	2019-12-16 11:56:11.213
151	4	522162	2019-12-16 11:56:11.213
152	4	535292	2019-12-16 11:56:11.213
153	4	338967	2019-12-16 11:56:11.213
154	4	519010	2019-12-16 11:56:11.213
155	4	554241	2019-12-16 11:56:11.213
156	4	511322	2019-12-16 11:56:11.213
157	4	482981	2019-12-16 11:56:11.213
158	4	513413	2019-12-16 11:56:11.213
159	4	586863	2019-12-16 11:56:11.213
160	4	498248	2019-12-16 11:56:11.213
161	1	512200	2019-12-16 12:01:29.476
162	1	330457	2019-12-16 12:01:29.476
163	1	492188	2019-12-16 12:01:29.476
164	1	398978	2019-12-16 12:01:29.476
165	1	546554	2019-12-16 12:01:29.476
166	1	290859	2019-12-16 12:01:29.476
167	1	501170	2019-12-16 12:01:29.476
168	1	551808	2019-12-16 12:01:29.476
169	1	359724	2019-12-16 12:01:29.476
170	1	473033	2019-12-16 12:01:29.476
171	1	292011	2019-12-16 12:01:29.476
172	1	461130	2019-12-16 12:01:29.477
173	1	508965	2019-12-16 12:01:29.477
174	1	549053	2019-12-16 12:01:29.477
175	1	592128	2019-12-16 12:01:29.477
176	1	458897	2019-12-16 12:01:29.477
177	1	522162	2019-12-16 12:01:29.477
178	1	403300	2019-12-16 12:01:29.477
179	1	508664	2019-12-16 12:01:29.477
180	1	535292	2019-12-16 12:01:29.477
181	2	512200	2019-12-16 12:01:29.477
182	2	330457	2019-12-16 12:01:29.477
183	2	492188	2019-12-16 12:01:29.477
184	2	398978	2019-12-16 12:01:29.477
185	2	546554	2019-12-16 12:01:29.477
186	2	501170	2019-12-16 12:01:29.477
187	2	551808	2019-12-16 12:01:29.477
188	2	359724	2019-12-16 12:01:29.477
189	2	508965	2019-12-16 12:01:29.477
190	2	549053	2019-12-16 12:01:29.477
191	2	577332	2019-12-16 12:01:29.477
192	2	458897	2019-12-16 12:01:29.477
193	2	522162	2019-12-16 12:01:29.477
194	2	535292	2019-12-16 12:01:29.477
195	2	588787	2019-12-16 12:01:29.477
196	2	576692	2019-12-16 12:01:29.477
197	2	641370	2019-12-16 12:01:29.477
198	2	641336	2019-12-16 12:01:29.477
199	2	588531	2019-12-16 12:01:29.477
200	2	524348	2019-12-16 12:01:29.477
201	3	512200	2019-12-16 12:01:29.477
202	3	330457	2019-12-16 12:01:29.477
203	3	509967	2019-12-16 12:01:29.477
204	3	546554	2019-12-16 12:01:29.477
205	3	290859	2019-12-16 12:01:29.477
206	3	359724	2019-12-16 12:01:29.477
207	3	461130	2019-12-16 12:01:29.477
208	3	508965	2019-12-16 12:01:29.477
209	3	549053	2019-12-16 12:01:29.477
210	3	458897	2019-12-16 12:01:29.477
211	3	522162	2019-12-16 12:01:29.477
212	3	366668	2019-12-16 12:01:29.477
213	3	638695	2019-12-16 12:01:29.477
214	3	501907	2019-12-16 12:01:29.477
215	3	416153	2019-12-16 12:01:29.477
216	3	512263	2019-12-16 12:01:29.477
217	3	595975	2019-12-16 12:01:29.477
218	3	592480	2019-12-16 12:01:29.477
219	3	497322	2019-12-16 12:01:29.477
220	3	652467	2019-12-16 12:01:29.477
221	4	512200	2019-12-16 12:01:29.478
222	4	330457	2019-12-16 12:01:29.478
223	4	492188	2019-12-16 12:01:29.478
224	4	398978	2019-12-16 12:01:29.478
225	4	546554	2019-12-16 12:01:29.478
226	4	290859	2019-12-16 12:01:29.478
227	4	501170	2019-12-16 12:01:29.478
228	4	359724	2019-12-16 12:01:29.478
229	4	549053	2019-12-16 12:01:29.478
230	4	458897	2019-12-16 12:01:29.478
231	4	522162	2019-12-16 12:01:29.478
232	4	535292	2019-12-16 12:01:29.478
233	4	338967	2019-12-16 12:01:29.478
234	4	519010	2019-12-16 12:01:29.478
235	4	554241	2019-12-16 12:01:29.478
236	4	511322	2019-12-16 12:01:29.478
237	4	482981	2019-12-16 12:01:29.478
238	4	513413	2019-12-16 12:01:29.478
239	4	586863	2019-12-16 12:01:29.478
240	4	498248	2019-12-16 12:01:29.478
4	1	398978	2019-11-16 11:54:23.638
241	1	512200	2019-12-16 14:39:19.816
242	1	330457	2019-12-16 14:39:19.816
243	1	492188	2019-12-16 14:39:19.816
244	1	398978	2019-12-16 14:39:19.816
245	1	546554	2019-12-16 14:39:19.816
246	1	290859	2019-12-16 14:39:19.816
247	1	501170	2019-12-16 14:39:19.816
248	1	551808	2019-12-16 14:39:19.816
249	1	359724	2019-12-16 14:39:19.816
250	1	473033	2019-12-16 14:39:19.816
251	1	292011	2019-12-16 14:39:19.816
252	1	461130	2019-12-16 14:39:19.816
253	1	508965	2019-12-16 14:39:19.817
254	1	549053	2019-12-16 14:39:19.817
255	1	592128	2019-12-16 14:39:19.817
256	1	458897	2019-12-16 14:39:19.817
257	1	522162	2019-12-16 14:39:19.817
258	1	403300	2019-12-16 14:39:19.817
259	1	508664	2019-12-16 14:39:19.817
260	1	535292	2019-12-16 14:39:19.817
261	2	512200	2019-12-16 14:39:19.817
262	2	330457	2019-12-16 14:39:19.817
263	2	492188	2019-12-16 14:39:19.817
264	2	398978	2019-12-16 14:39:19.817
265	2	546554	2019-12-16 14:39:19.817
266	2	501170	2019-12-16 14:39:19.817
267	2	551808	2019-12-16 14:39:19.817
268	2	359724	2019-12-16 14:39:19.817
269	2	508965	2019-12-16 14:39:19.817
270	2	549053	2019-12-16 14:39:19.817
271	2	577332	2019-12-16 14:39:19.817
272	2	458897	2019-12-16 14:39:19.817
273	2	522162	2019-12-16 14:39:19.817
274	2	535292	2019-12-16 14:39:19.817
275	2	588787	2019-12-16 14:39:19.817
276	2	576692	2019-12-16 14:39:19.817
277	2	641370	2019-12-16 14:39:19.817
278	2	641336	2019-12-16 14:39:19.817
279	2	588531	2019-12-16 14:39:19.817
280	2	524348	2019-12-16 14:39:19.817
281	3	512200	2019-12-16 14:39:19.817
282	3	330457	2019-12-16 14:39:19.817
283	3	509967	2019-12-16 14:39:19.817
284	3	546554	2019-12-16 14:39:19.817
285	3	290859	2019-12-16 14:39:19.817
286	3	359724	2019-12-16 14:39:19.817
287	3	461130	2019-12-16 14:39:19.817
288	3	508965	2019-12-16 14:39:19.818
289	3	549053	2019-12-16 14:39:19.818
290	3	458897	2019-12-16 14:39:19.818
291	3	522162	2019-12-16 14:39:19.818
292	3	366668	2019-12-16 14:39:19.818
293	3	638695	2019-12-16 14:39:19.818
294	3	501907	2019-12-16 14:39:19.818
295	3	416153	2019-12-16 14:39:19.818
296	3	512263	2019-12-16 14:39:19.818
297	3	595975	2019-12-16 14:39:19.818
298	3	592480	2019-12-16 14:39:19.818
299	3	497322	2019-12-16 14:39:19.818
300	3	652467	2019-12-16 14:39:19.818
301	4	512200	2019-12-16 14:39:19.818
302	4	330457	2019-12-16 14:39:19.818
303	4	492188	2019-12-16 14:39:19.818
304	4	398978	2019-12-16 14:39:19.818
305	4	546554	2019-12-16 14:39:19.818
306	4	290859	2019-12-16 14:39:19.818
307	4	501170	2019-12-16 14:39:19.818
308	4	359724	2019-12-16 14:39:19.818
309	4	549053	2019-12-16 14:39:19.818
310	4	458897	2019-12-16 14:39:19.818
311	4	522162	2019-12-16 14:39:19.818
312	4	535292	2019-12-16 14:39:19.818
313	4	338967	2019-12-16 14:39:19.818
314	4	519010	2019-12-16 14:39:19.818
315	4	554241	2019-12-16 14:39:19.818
316	4	511322	2019-12-16 14:39:19.818
317	4	482981	2019-12-16 14:39:19.818
318	4	513413	2019-12-16 14:39:19.818
319	4	586863	2019-12-16 14:39:19.818
320	4	498248	2019-12-16 14:39:19.818
\.


--
-- TOC entry 2861 (class 0 OID 16722)
-- Dependencies: 202
-- Data for Name: movies; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.movies (id, name, director, country_produced) FROM stdin;
1	The Irishman	\N	\N
512200	Jumanji: The Next Level	\N	\N
330457	Frozen II	\N	\N
492188	Marriage Story	\N	\N
398978	The Irishman	\N	\N
546554	Knives Out	\N	\N
290859	Terminator: Dark Fate	\N	\N
501170	Doctor Sleep	\N	\N
551808	Black Christmas	\N	\N
359724	Ford v Ferrari	\N	\N
473033	Uncut Gems	\N	\N
292011	Richard Jewell	\N	\N
461130	Code 8	\N	\N
508965	Klaus	\N	\N
549053	Last Christmas	\N	\N
592128	Mob Town	\N	\N
458897	Charlie's Angels	\N	\N
522162	Midway	\N	\N
403300	A Hidden Life	\N	\N
508664	Danger Close: The Battle of Long Tan	\N	\N
535292	21 Bridges	\N	\N
577332	Pपानीपट	\N	\N
588787	Ordinary Love	\N	\N
576692	Human Nature	\N	\N
641370	Invasion Planet Earth	\N	\N
641336	The Last Right	\N	\N
588531	StarDog and TurboCat	\N	\N
524348	The Report	\N	\N
509967	6 Underground	\N	\N
366668	Playmobil: The Movie	\N	\N
638695	Réservoir	\N	\N
501907	A Beautiful Day in the Neighborhood	\N	\N
416153	Arctic Dogs	\N	\N
512263	Honey Boy	\N	\N
595975	La belle époque	\N	\N
592480	Alice et le maire	\N	\N
497322	Love Pool	\N	\N
652467	Eidolon	\N	\N
338967	Zombieland: Double Tap	\N	\N
519010	Dolor y gloria	\N	\N
554241	Playing with Fire	\N	\N
511322	The Good Liar	\N	\N
482981	Wild Rose	\N	\N
513413	Spider in the Web	\N	\N
586863	Les Misérables	\N	\N
498248	Mia et le lion blanc	\N	\N
\.


--
-- TOC entry 2865 (class 0 OID 16804)
-- Dependencies: 206
-- Data for Name: movies_count; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.movies_count (id, year, month, country, no_movies) FROM stdin;
321	2019	12	1	20
322	2019	12	2	20
323	2019	12	3	20
324	2019	12	4	20
325	2019	12	1	20
326	2019	12	2	20
327	2019	12	3	20
328	2019	12	4	20
329	2019	11	1	1
\.


--
-- TOC entry 2863 (class 0 OID 16764)
-- Dependencies: 204
-- Data for Name: people; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.people (id, first_name, last_name, country) FROM stdin;
1	Martin	Scorsese	1
\.


--
-- TOC entry 2864 (class 0 OID 16775)
-- Dependencies: 205
-- Data for Name: reviews; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.reviews (id, author, movie, rate, text) FROM stdin;
\.


--
-- TOC entry 2873 (class 0 OID 0)
-- Dependencies: 208
-- Name: hibernate_sequence; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.hibernate_sequence', 329, true);


--
-- TOC entry 2712 (class 2606 OID 16736)
-- Name: countries countries_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.countries
    ADD CONSTRAINT countries_pkey PRIMARY KEY (id);


--
-- TOC entry 2724 (class 2606 OID 16819)
-- Name: currently_in_theaters currently_in_theaters_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.currently_in_theaters
    ADD CONSTRAINT currently_in_theaters_pkey PRIMARY KEY (id);


--
-- TOC entry 2722 (class 2606 OID 16808)
-- Name: movies_count movies_count_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.movies_count
    ADD CONSTRAINT movies_count_pkey PRIMARY KEY (id);


--
-- TOC entry 2710 (class 2606 OID 16742)
-- Name: movies movies_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.movies
    ADD CONSTRAINT movies_pkey PRIMARY KEY (id);


--
-- TOC entry 2715 (class 2606 OID 16768)
-- Name: people peaple_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.people
    ADD CONSTRAINT peaple_pkey PRIMARY KEY (id);


--
-- TOC entry 2719 (class 2606 OID 16779)
-- Name: reviews reviews_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.reviews
    ADD CONSTRAINT reviews_pkey PRIMARY KEY (id);


--
-- TOC entry 2725 (class 1259 OID 16825)
-- Name: fki_currently_country_fkey; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_currently_country_fkey ON public.currently_in_theaters USING btree (country);


--
-- TOC entry 2726 (class 1259 OID 16831)
-- Name: fki_currently_movie_fkey; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_currently_movie_fkey ON public.currently_in_theaters USING btree (movie);


--
-- TOC entry 2720 (class 1259 OID 16814)
-- Name: fki_movies_count_country_fkey; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_movies_count_country_fkey ON public.movies_count USING btree (country);


--
-- TOC entry 2707 (class 1259 OID 16803)
-- Name: fki_movies_country_produced_fkey; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_movies_country_produced_fkey ON public.movies USING btree (country_produced);


--
-- TOC entry 2708 (class 1259 OID 16774)
-- Name: fki_movies_director_fkey; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_movies_director_fkey ON public.movies USING btree (director);


--
-- TOC entry 2713 (class 1259 OID 16797)
-- Name: fki_people_country_fkey; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_people_country_fkey ON public.people USING btree (country);


--
-- TOC entry 2716 (class 1259 OID 16785)
-- Name: fki_reviews_author_fkey; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_reviews_author_fkey ON public.reviews USING btree (author);


--
-- TOC entry 2717 (class 1259 OID 16791)
-- Name: fki_reviews_movie_fkey; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_reviews_movie_fkey ON public.reviews USING btree (movie);


--
-- TOC entry 2733 (class 2606 OID 16820)
-- Name: currently_in_theaters currently_country_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.currently_in_theaters
    ADD CONSTRAINT currently_country_fkey FOREIGN KEY (country) REFERENCES public.countries(id) NOT VALID;


--
-- TOC entry 2734 (class 2606 OID 16826)
-- Name: currently_in_theaters currently_movie_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.currently_in_theaters
    ADD CONSTRAINT currently_movie_fkey FOREIGN KEY (movie) REFERENCES public.movies(id) NOT VALID;


--
-- TOC entry 2732 (class 2606 OID 16809)
-- Name: movies_count movies_count_country_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.movies_count
    ADD CONSTRAINT movies_count_country_fkey FOREIGN KEY (country) REFERENCES public.countries(id) NOT VALID;


--
-- TOC entry 2728 (class 2606 OID 16798)
-- Name: movies movies_country_produced_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.movies
    ADD CONSTRAINT movies_country_produced_fkey FOREIGN KEY (country_produced) REFERENCES public.countries(id) NOT VALID;


--
-- TOC entry 2727 (class 2606 OID 16769)
-- Name: movies movies_director_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.movies
    ADD CONSTRAINT movies_director_fkey FOREIGN KEY (director) REFERENCES public.people(id) NOT VALID;


--
-- TOC entry 2729 (class 2606 OID 16792)
-- Name: people people_country_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.people
    ADD CONSTRAINT people_country_fkey FOREIGN KEY (country) REFERENCES public.countries(id) NOT VALID;


--
-- TOC entry 2730 (class 2606 OID 16780)
-- Name: reviews reviews_author_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.reviews
    ADD CONSTRAINT reviews_author_fkey FOREIGN KEY (author) REFERENCES public.people(id) NOT VALID;


--
-- TOC entry 2731 (class 2606 OID 16786)
-- Name: reviews reviews_movie_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.reviews
    ADD CONSTRAINT reviews_movie_fkey FOREIGN KEY (movie) REFERENCES public.movies(id) NOT VALID;


-- Completed on 2019-12-17 13:48:00

--
-- PostgreSQL database dump complete
--

